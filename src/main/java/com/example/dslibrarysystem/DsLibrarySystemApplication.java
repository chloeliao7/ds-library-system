package com.example.dslibrarysystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsLibrarySystemApplication {

    public static void main(String[] args) {
        RedisPublisher.main(null);
        SpringApplication.run(DsLibrarySystemApplication.class, args);
    }
}
