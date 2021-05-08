package de.gehalt.stepdefs;

import de.gehalt.pages.RechnerPage;
import de.gehalt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RechnerStepDefs {

    RechnerPage rechnerPage = new RechnerPage();
    @Then("user inputs the requried data to calculate salary")
    public void user_inputs_the_requried_data_to_calculate_salary() {
        rechnerPage.inputRequirements();
    }

    @Then("user should able to see Monatlich and Jährlich net salary calculation as a result")
    public void user_should_able_to_see_Monatlich_and_Jährlich_net_salary_calculation_as_a_result() {
        BrowserUtils.switchToWindow("Ihr Ergebnis in Netto");
        Assert.assertTrue(rechnerPage.nettoGehaltResultText.isDisplayed());
        Assert.assertTrue(rechnerPage.monatlichText.isDisplayed());
        Assert.assertTrue(rechnerPage.jährlichText.isDisplayed());
        Assert.assertTrue(rechnerPage.monatlichNettoGehalt.isDisplayed());
        Assert.assertTrue(rechnerPage.jährlichNettoGehalt.isDisplayed());

    }

    @Then("user should able to see the {string} Job offers {int} km around {string}")
    public void user_should_able_to_see_the_Job_offers_km_around(String expectedJobTitle, int expectedDistance, String excpectedLocation) {
        String actualJobTitle = rechnerPage.jobTitle.getText();
        String actualDistance = rechnerPage.distance.getText();
        String actualLocation = rechnerPage.location.getText();

        Assert.assertEquals(expectedJobTitle,actualJobTitle);
        Assert.assertEquals(expectedDistance,Integer.parseInt(actualDistance));
        Assert.assertEquals(excpectedLocation,actualLocation);
    }
}
