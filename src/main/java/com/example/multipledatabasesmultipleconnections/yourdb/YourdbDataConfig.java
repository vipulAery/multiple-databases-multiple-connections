package com.example.multipledatabasesmultipleconnections.yourdb;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Map;
import java.util.Properties;


@Configuration
@EnableJpaRepositories(basePackages = {"com.example.multipledatabasesmultipleconnections.yourdb"} ,
        entityManagerFactoryRef = "yourdbEntityManagerFactory",
        transactionManagerRef = "yourdbTransactionManager")
public class YourdbDataConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.yourdb")
    public DataSource yourdbDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean yourdbEntityManagerFactory(
            JpaVendorAdapter jpaVendorAdapter, Properties hibernatePostgresqlProperties) {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(yourdbDataSource());

        factoryBean.setJpaProperties(hibernatePostgresqlProperties);
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setPackagesToScan(YourdbDataConfig.class.getPackage().getName());

        return factoryBean;

    }

    @Bean
    public PlatformTransactionManager yourdbTransactionManager(EntityManagerFactory yourdbEntityManagerFactory) {
        return new JpaTransactionManager(yourdbEntityManagerFactory);
    }
}
