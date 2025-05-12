--liquibase formatted sql
--changeset Ricardo:202408191938
--comment: boards-table-create

    CREATE TABLE boards(
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(255) NOT NULL
    ) ENGINE=InnoDB;

--rollback DROP TABLE boards