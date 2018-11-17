package com.automation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = "com.automation.step_definitions",
        tags = {}
)
public class RunCukesTest {

    @AfterClass
    public static void afterAll() {
        System.out.println("Finishing test run.");
    }
}