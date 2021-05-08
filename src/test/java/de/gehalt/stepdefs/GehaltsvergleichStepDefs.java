package de.gehalt.stepdefs;

import de.gehalt.pages.GehaltsvergleichPage;
import de.gehalt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class GehaltsvergleichStepDefs {

    GehaltsvergleichPage gehaltsvergleichPage = new GehaltsvergleichPage();
    @Then("user navigates to {string} page")
    public void user_navigates_to_page(String string) {
        gehaltsvergleichPage.schnellerGehaltsCheckBtn.click();
    }


    @Then("user inputs the answers of the questions as requirment  information for GehaltsCheck")
    public void user_inputs_the_answers_of_the_questions_as_requirment_information_for_GehaltsCheck() {
        gehaltsvergleichPage.inputAnswers("Bachelor (Uni)","Software-Tester/-in","Leer","baskara2@hotmail.com");
    }

    @Then("user should see {string} message on the page")
    public void user_should_see_message_on_the_page(String expectedMessage) {
        BrowserUtils.waitFor(2);
        String actualMessage = gehaltsvergleichPage.emailSentMsg.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

}
