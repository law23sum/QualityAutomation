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

    @Given("I have launched the Desktop App")
    public void iHaveLaunchedTheDesktopApp() {
    }

    @When("I wait till Desktop App Page is loaded")
    public void iWaitTillDesktopAppPageIsLoaded() {
    }

    @When("I refresh Desktop App Page")
    public void iRefreshDesktopAppPage() {
    }

    @When("I wait for {int} seconds")
    public void iWaitForSeconds(int arg0) {
    }

    @When("I identify the Desktop App Element {string}")
    public void iIdentifyTheDesktopAppElement(String arg0) {
    }

    @When("I insert text to the Desktop App Element by {string}")
    public void iInsertTextToTheDesktopAppElementBy(String arg0) {
    }

    @When("I click the Desktop App Element by {string}")
    public void iClickTheDesktopAppElementBy(String arg0) {
    }

    @When("I retrieve the field values of {string}")
    public void iRetrieveTheFieldValuesOf(String arg0) {
    }

    @When("I insert the resultant data into a file type {string}")
    public void iInsertTheResultantDataIntoAFileType(String arg0) {
    }
    @Then("I assert the resultant value {string} matches the expected value {string}")
    public void iAssertTheResultantValueMatchesTheExpectedValue(String arg0, String arg1) {
    }
}