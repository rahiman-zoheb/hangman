CREATE TABLE `guess` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `guess` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `word` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `word` varchar(140) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

