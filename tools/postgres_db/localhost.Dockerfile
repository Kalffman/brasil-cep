FROM postgres:14

COPY base_cep.sql /docker-entrypoint-initdb.d/