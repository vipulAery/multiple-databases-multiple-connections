package com.example.multipledatabasesmultipleconnections.jooqdb;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;


@Configuration
public class JooqdbDataConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.jooqdb")
    DataSource jooqdbDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    public DSLContext jooqdbDslContext(){
        return new DefaultDSLContext(jooqdbDataSource(), SQLDialect.POSTGRES);
    }

}
