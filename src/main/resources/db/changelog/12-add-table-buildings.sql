-- liquibase formatted sql
-- changeset Artyom:12
CREATE TABLE buildings
(
id               BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
building_name    VARCHAR(255)                            NOT NULL,
number_of_floors INTEGER                                 NOT NULL,
CONSTRAINT pk_buildings PRIMARY KEY (id)
);