def generate_primary_key_scripts(dictionary):
    for table, columns in dictionary.items():
        # hack: linkedtrial does not have unique keys. could handle apriori by ensuring distinct values
        # when creating pks
        if table != 'wdb_linkedtrial':
            for i, (k, v) in enumerate(columns.items()):
                if i == 0:
                    pk = k
            script = f'ALTER TABLE public.{table} ADD PRIMARY KEY ({pk});'
            print(script)


def get_pk_dict(dictionary):
    pk_dict = dict()
    for table, columns in dictionary.items():
        for i, (k, v) in enumerate(columns.items()):
            if i == 0:
                pk_dict[table] = k
    return pk_dict