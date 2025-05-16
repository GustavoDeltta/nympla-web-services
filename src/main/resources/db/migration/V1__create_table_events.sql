-- V1_create_table_event.sql

create table Events(
    `id` BIGSERIAL PRIMARY KEY,
    `identifier` VARCHAR(255) NOT NULL UNIQUE,
    `title` VARCHAR(255) NOT NULL,
    `description` TEXT,
    `start_date` TIMESTAMP NOT  NULL,
    `end_date` TIMESTAMP,
    `local_event` VARCHAR(255) NOT NULL,
    `capacity` INTEGER NOT NULL,
    `type` VARCHAR(255) NOT NULL,
    `image_url` VARCHAR(255)
)