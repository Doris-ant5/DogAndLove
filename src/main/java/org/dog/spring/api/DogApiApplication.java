package org.dog.spring.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class DogApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DogApiApplication.class, args);
    }

}
