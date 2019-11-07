package com.example.multipledatabasesmultipleconnections.theredb;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class TheredbDataConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.theredb")
    public DataSource theredbDataSource(){
        return DataSourceBuilder.create().build();
    }
    @Bean
    public DSLContext theredbDslContext(){
        return new DefaultDSLContext(theredbDataSource(), SQLDialect.POSTGRES);
    }


}

