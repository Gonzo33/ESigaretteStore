package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ESigaretteStoreApplication {

	public static void main(String[] args) {

		SpringApplication.run(ESigaretteStoreApplication.class, args);
	}

}
