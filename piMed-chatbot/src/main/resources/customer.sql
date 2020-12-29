CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_fname` varchar(45) DEFAULT NULL,
  `customer_lname` varchar(45) DEFAULT NULL,
  `customer_phoneno` int(10) NOT NULL,
  PRIMARY KEY (`customer_id`)
)ENGINE=InnoDB CHARSET=utf8;