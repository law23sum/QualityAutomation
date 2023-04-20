package com.company.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebAppsSteps {
	@Given("an event")
	public void givenStep() {
		System.out.println("Step");
	}

	@When("a situation")
	public void whenStep() {
		System.out.println("Step");
	}

	@Then("a conclusion")
	public void thenStep() {
		System.out.println("Step");
	}
}