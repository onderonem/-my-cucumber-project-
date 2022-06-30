package stepdefinitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class LoginStepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }


    @Given("user login dropdown")
    public void user_login_dropdown() {
        homePage.homeLoginButton.click();
    }


    @Given("user sends username {string}")
    public void user_sends_username(String string) {
        loginPage.username.sendKeys(string);
    }


    @Given("user sends password {string}")
    public void user_sends_password(String string) {
        loginPage.password.sendKeys(string);
    }


    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }


    @Given("user enters admin_username and admin_password")
    public void user_enters_admin_username_and_admin_password(DataTable credentials) {
        List<String> adminCredentials = credentials.row(1);//returns row1 data
        loginPage.username.sendKeys(adminCredentials.get(0));
        loginPage.password.sendKeys(adminCredentials.get(1));

    }
    @When("test case fails")
    public void test_case_fails() {
        Assert.assertTrue(false);
    }
}
