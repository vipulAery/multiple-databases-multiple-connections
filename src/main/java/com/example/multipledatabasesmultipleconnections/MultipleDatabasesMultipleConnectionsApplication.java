package com.example.multipledatabasesmultipleconnections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jooq.JooqAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(exclude = {JooqAutoConfiguration.class})
public class MultipleDatabasesMultipleConnectionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleDatabasesMultipleConnectionsApplication.class, args);
	}

}
