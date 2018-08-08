package com.example.testconfiguration.demo.bug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BugApplication {

    @Bean
    public String someString() {
        return "Production";
    }

    @Bean
    public String someAnotherString() {
        return "Production-2";
    }

    public static void main(String[] args) {
        SpringApplication.run(BugApplication.class, args);
    }
}
