CREATE DATABASE `crud-sample` CHAR SET utf8 COLLATE utf8_bin;
CREATE TABLE `crud-sample`.`tb_employee`
(
    `id`          char(50)  NOT NULL,
    `email`       char(100) NOT NULL,
    `first_name`  varchar(100) DEFAULT NULL,
    `last_name`   varchar(100) DEFAULT NULL,
    `description` varchar(500) DEFAULT NULL
);

CREATE TABLE `crud-sample`.`tb_gender`
(
    `id`    char(50)  NOT NULL,
    `title` char(100) NOT NULL,
    `order` int       NOT NULL
);