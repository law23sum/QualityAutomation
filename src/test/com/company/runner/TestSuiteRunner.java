package com.company.runner;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.company.steps"},
        plugin = {"pretty", "summary"}
)
public class TestSuiteRunner {
}