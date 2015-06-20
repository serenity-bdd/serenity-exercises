package net.mycompany.ebay.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;

public class DisplayProductDetailsScenarioSteps {

    @Given("I have searched for '(.*)'")
    public void givenIHaveSearchedFor(String searchTerm) {
        throw new PendingException();
    }

    @When("I (?:have selected|select) item (\\d+)")
    public void whenISelectListingItem(int number) {
      throw new PendingException();
    }

    @Then("I should see product description and price on the details page")
    public void thenIShouldSeeProductDescriptionAndPriceOnTheDetailsPage() {
      throw new PendingException();
    }
}
