# scottish-wdb
App for Exploring Scottish Witchcraft Dataset

Find the original data as a collection of CSV files here:

[data.world Scottish Witchcraft Data](https://data.world/history/scottish-witchcraft)

### Creating the PostgreSQL database:
- Clone this project
- The project contains pre-generated SQL. If you'd like to create new scripts from scratch: 
  - Create an environment variable `WDB_PROJECT_DIR` that is the root path of your project.
  - Run `Generate_WDB_Data.py` to generate the SQL files for Create Table, PK and FK generation.
- Run `wdb_create_tables.SQL`
- The tables in this dataset contain a few missing PK records. Run `Add_Missing_DB_Rows.SQL` to repair.
- Run `wdb_create_pks.SQL` to create primary keys.
- Run `wdb_create_fks.SQL` to create foreign keys.

### API
The API runs by default on port 8080.  Entity models are a work in progress, but a simplified version of the `Person` object that maps to 
the `wdb_person` table is accessible for demo at `/api/person` to return all records or `/api/person/{id}` to return a person by id.

### Known Issues:
- Trailing whitespace is created at some point before data insertion. This needs to be trimmed and scripts should be updated.

### Current Next Steps:
- Entity model and repository interfaces completion
- Endpoints completion
