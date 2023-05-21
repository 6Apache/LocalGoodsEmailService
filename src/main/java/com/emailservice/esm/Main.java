package com.emailservice.esm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.emailservice.esm")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}