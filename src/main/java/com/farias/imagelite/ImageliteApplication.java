package com.farias.imagelite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ImageliteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageliteApplication.class, args);
    }

}