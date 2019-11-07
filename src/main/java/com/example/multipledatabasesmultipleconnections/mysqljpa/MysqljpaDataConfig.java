package com.example.multipledatabasesmultipleconnections.mysqljpa;

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
@EnableJpaRepositories(basePackages = {"com.example.multipledatabasesmultipleconnections.mysqljpa"} ,
        entityManagerFactoryRef = "mysqljpaEntityManagerFactory",
        transactionManagerRef = "mysqljpaTransactionManager" )
public class MysqljpaDataConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.mysqljpa")
    public DataSource mysqljpaDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean mysqljpaEntityManagerFactory(
            JpaVendorAdapter jpaVendorAdapter, Properties hibernateMysqlProperties) {

        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(mysqljpaDataSource());
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setJpaProperties(hibernateMysqlProperties);
        factoryBean.setPackagesToScan(MysqljpaDataConfig.class.getPackage().getName());

        return factoryBean;

    }

    @Bean
    public PlatformTransactionManager mysqljpaTransactionManager(
            @Qualifier("mysqljpaEntityManagerFactory") EntityManagerFactory
                    mysqljpaEntityManagerFactory
    ) {
        return new JpaTransactionManager(mysqljpaEntityManagerFactory);
    }

}
