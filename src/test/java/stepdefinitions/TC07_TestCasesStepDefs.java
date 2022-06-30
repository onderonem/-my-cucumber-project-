package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC07_TestCasePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC07_TestCasesStepDefs {

   TC07_TestCasePage tc07_testCasePage= new TC07_TestCasePage();

    @Given("user launches the browser")
    public void user_launches_the_browser() {
        Driver.getDriver();
    }


    @When("user navigates to URL")
    public void user_navigates_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
    }


    @Then("user verifies that home page is visible successfully")
    public void user_verifies_that_home_page_is_visible_successfully() {
        Assert.assertEquals("https://automationexercise.com/",
                                   Driver.getDriver().getCurrentUrl());
    }


    @Then("user clicks on Test Cases button")
    public void user_clicks_on_test_cases_button() {
        tc07_testCasePage.testCaseLink.click();
    }


    @Then("user is navigated to test cases page successfully")
    public void user_is_navigated_to_test_cases_page_successfully() {
        // Assert.assertTrue(tc07_testCasePage.testCasesText.isDisplayed());
        // or
        Assert.assertEquals("TEST CASES", tc07_testCasePage.testCasesText.getText());
    }


    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();

    }
}
