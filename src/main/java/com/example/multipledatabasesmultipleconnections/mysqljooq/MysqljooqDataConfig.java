package com.example.multipledatabasesmultipleconnections.mysqljooq;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MysqljooqDataConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.mysqljooq")
    DataSource mysqljooqDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    public DSLContext mysqljooqDslContext(){
        return new DefaultDSLContext(mysqljooqDataSource(), SQLDialect.MYSQL);
    }

}
