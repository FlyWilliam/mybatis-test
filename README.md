# mybatis-test
a test about mybatis & springboot ,use pageHelper plugin implements page function


## create table and init 
```
DROP TABLE IF EXISTS `mybatis_test_acc`;
CREATE TABLE `mybatis_test_acc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `account` varchar(100) NOT NULL,
  `created_date` datetime NOT NULL,
  `created_by` varchar(100) NOT NULL,
  `updated_date` datetime NOT NULL,
  `updated_by` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
```
## init data
```
DELIMITER //
DROP PROCEDURE IF EXISTS INIT_MYBATIS_TEST_ACC;
CREATE PROCEDURE INIT_MYBATIS_TEST_ACC()
    BEGIN
    DECLARE n int DEFAULT 1;
        WHILE(n<1000) DO
            INSERT INTO mybatis_test_acc(id,`name`,account,created_date,created_by,updated_date,updated_by) VALUES(null,CONCAT("funName",n),CONCAT("funAcc",n), NOW(), "fun", NOW(), "fun");  
        set n = n + 1;
        END WHILE;
    END  //
DELIMITER;

call INIT_MYBATIS_TEST_ACC(); --invoke
```

