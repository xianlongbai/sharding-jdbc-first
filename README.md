# sharding-jdbc-first  (版本使用 1.5.4)

*   This is a  demo of sharding database and table using sharding jdbc
*   sharding-jdbc已经出到4.x版本了,交由apache来管理维护了
## how to start?
1. 创建两个数据库 ds_0 和 ds_1
2. 每个库分表创建两个表t_order_0和t_order_1,sql语句如下：

    ```
    DROP TABLE IF EXISTS t_order_0; 
    CREATE TABLE t_order_0 ( 
    order_id bigint(20) NOT NULL, 
    user_id bigint(20) NOT NULL, 
    PRIMARY KEY (order_id) 
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin; 
    ```

3. 修改DateSourceConfig类里的username，password即可启动

