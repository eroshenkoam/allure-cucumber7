package io.qameta.allure;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @When("today is Sunday")
    public void todayIsSunday() {
    }

    @Given("I ask whether it's Friday yet")
    public void askWhetherItsFridayYet() {
    }

    @Given("I ask whether it's Friday yet i need to add ploskiy JSON")
    public void askWhetherItsFridayYet2() {
    }

    @Then("I should be told {string}")
    public void shouldBeTold(String text) {
    }

    @When("print string \"str\"")
    public void blahblah1() {
    }

    @When("print string \"allure\"")
    public void blahblah2() {
    }

    @When("print string \"test\"")
    public void blahblah3() {
    }
}
