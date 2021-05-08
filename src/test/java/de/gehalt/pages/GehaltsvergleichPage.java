package de.gehalt.pages;

import de.gehalt.utilities.BrowserUtils;
import de.gehalt.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class GehaltsvergleichPage extends BasePage{


    @FindBy(linkText = "Schneller GehaltsCheck")
    public WebElement schnellerGehaltsCheckBtn;

    @FindBy(xpath = "//div/input[@type='range']")
    public WebElement slider;

    @FindBy(xpath = "//*[text()='Weiter']")
    public WebElement weiterBtn;

    @FindBy(xpath = "//label/span[text()='Männlich']")
    public WebElement männlichGender;

    @FindBy(id = "highestGraduationId")
    public WebElement höchstenAbschluss;

    @FindBy(xpath = "(//label/span[text()='Ja'])[1]")
    public WebElement berufstätigkeitJa;

    @FindBy(xpath = "//div/span[text()='Beruf eingeben und Vorschlag auswählen']")
    public WebElement jobId;

    @FindBy(xpath = "//div/input[@data-dropdown='search']")
    public WebElement berufeInputBox;

    @FindBy(xpath = "//li[@data-id='435']/span")
    public WebElement berufsWahl;

    @FindBy(xpath = "(//div/label/span[text()='Nein'])[2]")
    public WebElement personalVerantwortungNein;

    @FindBy(id = "city")
    public WebElement arbeitsortInputBox;

    @FindBy(xpath = "//li/a/b[text()='Leer']")
    public WebElement auswahlBestätigen;

    @FindBy(name = "email")
    public WebElement emailInputBox;

    @FindBy(xpath = "//span[text()='Ergebnis senden']")
    public WebElement ergebnisSendenBtn;

    @FindBy(xpath = "//*[text()='Ihr Ergebnis wartet auf Sie!']")
    public WebElement emailSentMsg;



    public void inputAnswers(String abschluss, String beruf, String wohnort, String email){
        slide(-10);
        BrowserUtils.waitFor(4);
        weiterBtn.click();
        männlichGender.click();
        höchstenAbschluss.click();
        Select abschlussSelect = new Select(höchstenAbschluss);
        abschlussSelect.selectByVisibleText(abschluss);
        berufstätigkeitJa.click();
        jobId.click();
        berufeInputBox.sendKeys(beruf);
        berufsWahl.click();
        personalVerantwortungNein.click();
        arbeitsortInputBox.sendKeys(wohnort);
        BrowserUtils.waitFor(2);
        BrowserUtils.hover(auswahlBestätigen);
        auswahlBestätigen.click();
        BrowserUtils.waitFor(2);
        emailInputBox.clear();
        emailInputBox.sendKeys(email);
        ergebnisSendenBtn.click();

    }


    public void slide( int value){


        int width= slider.getSize().getWidth();
        System.out.println(width);
        Actions move = new Actions(Driver.get());
        move.moveToElement(slider, value, 0).click();
        move.build().perform();

    }



}
