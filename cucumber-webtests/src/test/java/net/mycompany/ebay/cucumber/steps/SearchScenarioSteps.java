package net.mycompany.ebay.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;

public class SearchScenarioSteps {

    @Given("I (?:want|would like) to buy (.*)")
    public void buyerWantsToBuy(String article) {
      throw new PendingException();
    }

    @When("I search for '(.*)'")
    public void searchByKeyword(String keyword) {
      throw new PendingException();
    }

    @Then("I should see only articles related to the word '(.*)'")
    public void shouldSeeArticlesRelatedTo(String keyword) {
      throw new PendingException();
    }
}
