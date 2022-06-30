package stepdefinitions;

import io.cucumber.java.en.When;
import utilities.ReusableMethods;

import java.io.IOException;

public class ReusableStepDefs {
    @When("capture the screenshot")
    public void capture_the_screenshot() throws IOException {
        ReusableMethods.getScreenshot("capturingScreeShot");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
