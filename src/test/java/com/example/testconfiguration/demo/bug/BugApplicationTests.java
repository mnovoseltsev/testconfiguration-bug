package com.example.testconfiguration.demo.bug;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import({SomeTestConfiguration.class})
public class BugApplicationTests {

    @TestConfiguration
    static class InnerTestConfiguration {

        @Bean
        public String someAnotherString() {
            return "Test-2";
        }
    }

    @Autowired
    private String someString;

    @Autowired
    private String someAnotherString;

    @Test
    public void injectedStringShouldContainValueFromTestConfiguration() {

        assertEquals("Test", someString);
    }

    @Test
    public void injectedStringShouldContainValueFromInnerTestConfiguration() {

        assertEquals("Test-2", someAnotherString);
    }

}
