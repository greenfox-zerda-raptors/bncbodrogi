package com.greenfox.securesourcedemo.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
@ComponentScan

public class AppConfig {

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/security_demo");
        driverManagerDataSource.setUsername("bncbodrogi");
        driverManagerDataSource.setPassword("bodri666");
        return driverManagerDataSource;
    }


}
