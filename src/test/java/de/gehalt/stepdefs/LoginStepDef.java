package de.gehalt.stepdefs;


import de.gehalt.pages.BasePage;
import de.gehalt.pages.LoginPage;
import de.gehalt.utilities.BrowserUtils;
import de.gehalt.utilities.ConfigurationReader;
import de.gehalt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @Then("{string} header text should be displayed")
    public void header_text_should_be_displayed(String expectedText) {
        String actualText = loginPage.headerText.getText();
        Assert.assertEquals(expectedText,actualText);

    }

    @When("user logs in with {string} and {string}")
    public void user_logs_in_with_and(String username, String password) {
        loginPage.loginInvalid(username,password);
    }

    @Then("{string}  should be displayed")
    public void should_be_displayed(String expectedText) {
        String actualText = loginPage.invalidLoginText.getText();
        Assert.assertEquals(expectedText,actualText);
    }

}
