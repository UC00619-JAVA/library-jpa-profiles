package com.example.libraryjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class LibraryJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryJpaApplication.class, args);
    }
}
