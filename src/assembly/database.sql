CREATE DATABASE `crud_sample` CHAR SET utf8 COLLATE utf8_bin;
CREATE TABLE `crud_sample`.`tb_sample`
(
    `id`           char(50)  NOT NULL,
    `email`        char(100) NOT NULL,
    `display_name` varchar(100) DEFAULT NULL,
    `description`  varchar(500) DEFAULT NULL
);
