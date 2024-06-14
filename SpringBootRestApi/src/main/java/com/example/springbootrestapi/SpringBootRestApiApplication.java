package com.example.springbootrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringBootRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiApplication.class, args);
    }

}
