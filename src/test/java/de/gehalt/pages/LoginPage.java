package de.gehalt.pages;

import de.gehalt.utilities.BrowserUtils;
import de.gehalt.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(name = "username")
    public WebElement usernameInputBox;

    @FindBy(name = "password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//div/button")
    public WebElement loginButton;

    @FindBy(xpath = "//div/button[contains(text(),'Accept & Close')]")
    public WebElement cookiesAcceptBtn;

    @FindBy(className = "headline-xlarge-light")
    public WebElement headerText;

    @FindBy(xpath = "//span[contains(text(),'nicht korrekt')]")
    public WebElement invalidLoginText;





    public void login(String username, String password){

        Driver.get().switchTo().frame(1);
        BrowserUtils.waitForClickablility(cookiesAcceptBtn,4);
        cookiesAcceptBtn.click();
        Driver.get().switchTo().defaultContent();
        loginMenuButton.click();
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }

    public void loginInvalid(String username, String password){

        Driver.get().switchTo().frame(1);
        BrowserUtils.waitForClickablility(cookiesAcceptBtn,4);
        cookiesAcceptBtn.click();
        Driver.get().switchTo().defaultContent();
        loginMenuButton.click();
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }

}
