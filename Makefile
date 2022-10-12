PASS:=b4s30c3p
USER:=base-cep
DB_NAME:=base-cep

build_localhost_pg_db:
	docker build -t kalffman/brasil_cep_postgres_db:local -f ./tools/postgres_db/Dockerfile tools/postgres_db
	docker scan --severity=medium kalffman/brasil_cep_postgres_db:local

init_localhost_pg_db: build_pg_db
	docker run --name brasil_cep_db \
		-e POSTGRES_USER=$(USER) \
		-e POSTGRES_PASSWORD=$(PASS) \
		-e POSTGRES_DB=$(DB_NAME) \
		-p 5432:5432 -d \
		kalffman/brasil_cep_postgres_db:local

start_localhost_pg_db:
	docker start brasil_cep_db