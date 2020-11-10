
CREATE TABLE IF NOT EXISTS `properties` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `application` varchar(64) DEFAULT 'demo',
  `profile` varchar(64) DEFAULT 'default',
  `label` varchar(64) DEFAULT 'master',
  `name` varchar(255) NOT NULL,
  `value` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`id`)
);