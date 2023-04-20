package com.company.steps;

import com.company.steps.WebAppActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class WebAppsSteps {
        
        @Steps
        WebAppActions webAppActions;
        
        @Given("the user opens the application")
        public void theUserOpensTheApplication() {
                webAppActions.openApplication();
        }
        
        @When("the user performs some action")
        public void theUserPerformsSomeAction() {
                webAppActions.performAction();
        }
        
        @Then("the user should see the expected result")
        public void theUserShouldSeeTheExpectedResult() {
                webAppActions.verifyResult();
        }
}