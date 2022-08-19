CREATE DATABASE IF NOT EXISTS `bard-crud-sample` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
#
USE `bard-crud-sample`;
#
CREATE USER IF NOT EXISTS 'bard-crud-sample'@'%' IDENTIFIED BY '1';
GRANT Select, Insert, Update, Delete ON `bard-crud-sample`.* TO 'bard-crud-sample'@'%';
#
DROP TABLE IF EXISTS `tb_gender`;
CREATE TABLE `tb_gender`
(
    `id`    char(50)  NOT NULL,
    `title` char(100) NOT NULL,
    `order` int       NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `tb_gender_uk_title` (`title`)
);
#
DROP TABLE IF EXISTS `tb_customer`;
CREATE TABLE `tb_customer`
(
    `id`          char(50)  NOT NULL,
    `email`       char(100) NOT NULL,
    `gender_id`   char(50)     DEFAULT NULL,
    `first_name`  varchar(100) DEFAULT NULL,
    `last_name`   varchar(100) DEFAULT NULL,
    `description` varchar(500) DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `tb_customer_uk_email` (`email`),
    KEY `tb_customer_fk_gender` (`gender_id`),
    CONSTRAINT `tb_customer_fk_gender` FOREIGN KEY (`gender_id`) REFERENCES `tb_gender` (`id`)
);
#
DROP TABLE IF EXISTS `tb_product`;
CREATE TABLE `tb_product`
(
    `id`    int          NOT NULL AUTO_INCREMENT,
    `name`  varchar(100) NOT NULL,
    `price` decimal(50, 2) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
#
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`
(
    `customer_id` char(50) NOT NULL,
    `product_id`  int      NOT NULL,
    `count`       int      NOT NULL,
    PRIMARY KEY (`customer_id`, `product_id`),
    KEY `tb_order_fk_product` (`product_id`),
    CONSTRAINT `tb_order_fk_customer` FOREIGN KEY (`customer_id`) REFERENCES `tb_customer` (`id`),
    CONSTRAINT `tb_order_fk_product` FOREIGN KEY (`product_id`) REFERENCES `tb_product` (`id`)
);
