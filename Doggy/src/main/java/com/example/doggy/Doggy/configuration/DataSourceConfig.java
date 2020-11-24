package com.example.doggy.Doggy.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @ConfigurationProperties(prefix = "spring.dataSource")
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();

    }



}
