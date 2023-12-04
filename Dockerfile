FROM postgres:15-bullseye
LABEL name="benkyo_postgres"

COPY ./docker_resources/init.sql /docker-entrypoint-initdb.d/init.sql

ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD postgres

EXPOSE 5432
