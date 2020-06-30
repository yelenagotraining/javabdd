package com.pluralsight.bdd.loyalty_cards;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SuperSmoothieDietFriendly {
    @Given("Doug has opted for the diet-friendly plan")
    public void doug_has_opted_for_the_diet_friendly_plan() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Doug views the description of the {string}")
    public void doug_views_the_description_of_the(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("he should be shown the following {string} smoothies:")
    public void he_should_be_shown_the_following_smoothies(String string, io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new cucumber.api.PendingException();
    }

    @Then("he should be shown that this is a {string} smoothie")
    public void he_should_be_shown_that_this_is_a_smoothie(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
