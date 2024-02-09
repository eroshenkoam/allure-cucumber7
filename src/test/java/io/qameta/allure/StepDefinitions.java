package io.qameta.allure;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {


    @When("today is Sunday, but")
    public void todayIsSundayBut() {
    }

    @Given("There is a problem")
    public void problem() {
    }

    @Given("There is a question")
    public void question() {
    }

    @When("I need to add ploskiy JSON")
    public void ploskiyJson() {
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

    @Given("today is Sunday")
    public void method1() {
    }

    @When("I ask whether it's Friday yet")
    public void method2() {
    }
}
