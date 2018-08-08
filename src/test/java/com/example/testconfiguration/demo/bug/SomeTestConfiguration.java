package com.example.testconfiguration.demo.bug;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class SomeTestConfiguration {

    @Bean
    public String someString() {
        return "Test";
    }
}
