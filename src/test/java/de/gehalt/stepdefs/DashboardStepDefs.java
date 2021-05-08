package de.gehalt.stepdefs;

import de.gehalt.pages.DashboardPage;
import de.gehalt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DashboardStepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    @When("user navigates to {string} menu")
    public void user_navigates_to_menu(String tab) {
        dashboardPage.navigateTo(tab);

    }

    @Then("page title should contains {string}")
    public void page_title_should_contains(String expectedTitle) {
        String actualTitle = BrowserUtils.getPageTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
