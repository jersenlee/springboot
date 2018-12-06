package com.jersenlee.mysql_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MysqlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlDemoApplication.class, args);
    }
}
