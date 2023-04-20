package com.company.runner;

import net.serenitybdd.cucumber.*;
import cucumber.api.CucumberOptions;
import org.junit.Test;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.company.steps"},
        plugin = {"pretty", "summary"}
)
public class TestSuiteRunner {
}