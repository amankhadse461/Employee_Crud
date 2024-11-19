package com.app.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class SpringBootJpaEmployeeCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaEmployeeCrudApplication.class, args);
	}

}
