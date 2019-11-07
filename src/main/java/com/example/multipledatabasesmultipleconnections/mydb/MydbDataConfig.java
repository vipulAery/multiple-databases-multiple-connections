package com.example.multipledatabasesmultipleconnections.mydb;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.sql.DataSource;
import java.util.Properties;


@Configuration
@EnableJpaRepositories(basePackages = {"com.example.multipledatabasesmultipleconnections.mydb"} ,
        entityManagerFactoryRef = "mydbEntityManagerFactory",
        transactionManagerRef = "mydbTransactionManager" )

public class MydbDataConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.mydb")
    public DataSource mydbDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean mydbEntityManagerFactory(
            JpaVendorAdapter jpaVendorAdapter, Properties hibernatePostgresqlProperties) {

        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(mydbDataSource());
        factoryBean.setJpaProperties(hibernatePostgresqlProperties);
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setPackagesToScan(MydbDataConfig.class.getPackage().getName());

        return factoryBean;

    }

    @Bean
    public PlatformTransactionManager mydbTransactionManager(
            @Qualifier("mydbEntityManagerFactory") EntityManagerFactory
                    mydbEntityManagerFactory
    ) {
        return new JpaTransactionManager(mydbEntityManagerFactory);
    }


}
