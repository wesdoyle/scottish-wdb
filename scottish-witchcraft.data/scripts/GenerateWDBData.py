import os
from collections import OrderedDict

DATA_ROOT = 'C:/Users/wes/Projects/scottish-witchcraft/scottish-witchcraft.data/source_data'
DATASOURCE = os.path.join(DATA_ROOT, 'DataFromReadme')
CSV_DIR = 'C:/Users/wes/Projects/scottish-witchcraft/scottish-witchcraft.data/source_data/tables_csv/'

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
    the  WDB dataset CSV files"""
    tables_dict = parse_table_data()
    source_dtypes = get_data_types(tables_dict)
    data_map = OrderedDict(zip(source_dtypes, POSTGRES_DTYPES_MAP))
    tables_dict = clean_data_types(tables_dict, data_map)
    scripts = generate_table_scripts(tables_dict)
    save_scripts(scripts)


# {'table_name': {'column', 'dtype'}}

def parse_table_data():
    tables_dict = dict()
    with open(DATASOURCE) as f:
        for i, line in enumerate(f):
            line = line.lower().strip().replace('/', '_').replace('-', '_')

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

        # There is a column in the WDB_Person which is unaccounted for in the README.
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


def print_scripts(scripts):
    for script in scripts:
        print(script)
        print('\n')

def save_scripts(scripts):
    fpath = os.path.join(DATA_ROOT, 'wdb_postgres_create.sql')
    with open(fpath, 'w') as file:
        for line in scripts:
            file.write(line)
    print(f'Scripts saved to {fpath}.')


if __name__ == "__main__":
    run_script()