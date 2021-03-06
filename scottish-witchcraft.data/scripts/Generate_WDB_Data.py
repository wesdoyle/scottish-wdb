"""
This script generates a SQL file used for creating tables
and populating data from the WDB data CSV files.
Data types are defined in the data set's README file.
Original data may be found at https://data.world/history/scottish-witchcraft
"""

import os
from collections import OrderedDict

DATA_ROOT = os.path.join(os.environ['WDB_PROJECT_DIR'], 'scottish-witchcraft.data/source_data')
SCRIPTS_ROOT = os.path.join(os.environ['WDB_PROJECT_DIR'], 'scottish-witchcraft.data/scripts')
DATA_SOURCE = os.path.join(DATA_ROOT, 'DataFromReadme')
CSV_DIR = os.path.join(DATA_ROOT, 'tables_csv')
CSV_FILES = sorted([os.path.splitext(f)[0].lower() for f in os.listdir(CSV_DIR) if f.endswith('csv')])

POSTGRES_DTYPES_MAP = [
    'character(20)',
    'character(3)',
    'bigint',
    'character(50)',
    'character(6)',
    'integer',
    'boolean',
    'character(2)',
    'text',
    'date',
    'character(100)',
    'character(250)',
    'character(255)',
    'text']


def run_script():
    """Generates a SQL file to create and populated tables from
    the  WDB data set CSV files"""

    tables_dict = parse_table_data()
    source_dtypes = get_data_types(tables_dict)
    data_map = OrderedDict(zip(source_dtypes, POSTGRES_DTYPES_MAP))
    tables_dict = clean_data_types(tables_dict, data_map)

    create_tables = generate_table_scripts(tables_dict)
    create_pks = generate_primary_key_scripts(tables_dict)
    create_fks = generate_foreign_key_scripts(tables_dict)

    save_script(create_tables, 'wdb_create_tables.sql')
    save_script(create_pks, 'wdb_create_pks.sql')
    save_script(create_fks, 'wdb_create_fks.sql')


# {'table_name': {'column', 'dtype'}}

def parse_table_data():
    tables_dict = dict()
    with open(DATA_SOURCE) as f:
        for i, line in enumerate(f):
            line = line.lower().strip().replace('/', '_').replace('-', '_')

            # data types are defined in a table in the README, which is now copied
            # into a text file. The copied structure of this table is line-delimited and periodic:
            # {table_name_a} (all prefixed 'wdb')
            # 'column'
            # 'data type'
            # 'description'
            # {col_a1}
            # {data_type_a1}
            # {desc_a1}
            # {col_a2}
            # {data_type_a2}
            # {desc_a2}
            # etc. -- Thus, we can reset a counter when line starts with wdb and cycle in thirds

            if line.startswith('wdb'):
                current_dict = dict()
                tables_dict[line] = current_dict
                j = 0

            j = j % 3
            if j == 1:
                if line != 'column':
                    col_name = line.replace(' ', '_')
                    current_dict[col_name] = None
            if j == 2:
                if line != 'data type':
                    d_type = line
                    current_dict[col_name] = d_type
            j += 1
    return tables_dict


def get_data_types(tables_dict):
    table_cols = [cols for table, cols in tables_dict.items()]

    dtypes = []
    for col in table_cols:
        for colname, dtype in col.items():
            if dtype not in dtypes:
                dtypes.append(dtype)
    return dtypes


def clean_data_types(tables_dict, data_map):
    for table, columns in tables_dict.items():
        for k, v in columns.items():
            columns[k] = data_map[v]
    return tables_dict


def generate_table_scripts(dictionary):
    scripts = []

    for table, columns in dictionary.items():

        # There is a column in the WDB_Person which is unaccounted for in the README table.
        script = f'CREATE TABLE {table} ('
        if table == 'wdb_person':
            for i, (k, v) in enumerate(columns.items()):
                script += f'{k} {v}'
                if k == 'residence':
                    script += ', isdeleted boolean'
                if i != len(columns) - 1:
                    script += ', '
            script += "); "

        else:
            for i, (k, v) in enumerate(columns.items()):
                script += f'{k} {v}'
                if i != len(columns) - 1:
                    script += ', '
            script += "); "

        if table in CSV_FILES:
            table_path = os.path.join(CSV_DIR, table)
            script += f"\nCOPY {table} FROM '{table_path}.csv' WITH (FORMAT csv, HEADER True);\n"
        scripts.append(script)

    return scripts


def generate_primary_key_scripts(dictionary):
    scripts = []
    for table, columns in dictionary.items():
        # hack: linkedtrial does not have unique keys. could handle apriori by ensuring distinct values
        # when creating pks
        if table != 'wdb_linkedtrial':
            for i, (k, v) in enumerate(columns.items()):
                if i == 0:
                    pk = k
            script = f'ALTER TABLE public.{table} ADD PRIMARY KEY ({pk});\n'
            scripts.append(script)
    return scripts


def get_pk_dict(dictionary):
    pk_dict = dict()
    for table, columns in dictionary.items():
        for i, (k, v) in enumerate(columns.items()):
            if i == 0:
                pk_dict[table] = k
    return pk_dict


def generate_foreign_key_scripts(tables_dict):
    scripts = []
    pks = get_pk_dict(tables_dict)
    for table, columns in tables_dict.items():
        for i, (col_name, col_dtype) in enumerate(columns.items()):
            if i != 0:  # ignore PKs
                for pk_table, pk_col in pks.items():
                    if col_name == pk_col:
                        script = f'ALTER TABLE public.{table}\n \
                        ADD CONSTRAINT fk_{table}_to_{pk_col}\n \
                        FOREIGN KEY ({col_name})\n \
                        REFERENCES {pk_table}({pk_col});\n\n'
                        scripts.append(script)
    return scripts


def print_scripts(scripts):
    for script in scripts:
        print(script)
        print('\n')


def save_script(scripts, name):
    fpath = os.path.join(SCRIPTS_ROOT, name)
    with open(fpath, 'w') as file:
        file.write(f"-- This script is auto-generated \n\n")
        for line in scripts:
            file.write(line)
    print(f'Scripts saved to {fpath}.')


if __name__ == "__main__":
    run_script()
