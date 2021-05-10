package de.gehalt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class RechnerPage extends BasePage{

    @FindBy(id= "brutto_basic")
    public WebElement bruttoGehaltInputBox;

    @FindBy(xpath = "(//div/label/span[text()='Jährlich'])[1]")
    public WebElement salaryType;

    @FindBy(id = "stk_basic")
    public WebElement steuerklasse;
    Select steuerSelect = new Select(steuerklasse);

    @FindBy(xpath = "(//div/label/span[text()='Ja'])[1]")
    public WebElement kinder;

    @FindBy(id = "zkf_basic")
    public WebElement kinderfreibetrag;
    Select kinderfreibetragSelect = new Select(kinderfreibetrag);

    @FindBy(id = "kirche1")
    public WebElement kirche;

    @FindBy(id = "bdl_basic")
    public WebElement bundesland;
    Select bundeslandSelect = new Select(bundesland);

    @FindBy(id = "stadt_basic")
    public WebElement wohnortInputBox;

    @FindBy(id = "berufsbezeichnung_basic")
    public WebElement beruf;

    @FindBy(id = "pkv_basic")
    public WebElement krankenkasse;
    Select krankenkasseSelect = new Select(krankenkasse);

    @FindBy(xpath = "//button/span[text()='Berechnen']")
    public WebElement berechnenButton;

    @FindBy(xpath = "//div/b[text()='Netto-Gehalt']")
    public WebElement nettoGehaltResultText;

    @FindBy(xpath = "//div/b[text()='Monatlich']")
    public WebElement monatlichText;

    @FindBy(xpath = "//div/b[text()='Jährlich']")
    public WebElement jährlichText;

    @FindBy(id = "nettojahr")
    public WebElement jährlichNettoGehalt;

    @FindBy(id = "nettomonat")
    public WebElement monatlichNettoGehalt;

    @FindBy(xpath = "(//h2/b)[2]")
    public WebElement jobTitle;

    @FindBy(xpath = "//h2/span/b")
    public WebElement location;

    @FindBy(xpath = "//span/span[@class='distance']")
    public WebElement distance;



    public void inputRequirements(){
        bruttoGehaltInputBox.sendKeys("55000");
        salaryType.click();
        steuerSelect.selectByVisibleText("Lohnsteuerklasse 3");
        kinder.click();
        kinderfreibetragSelect.selectByVisibleText("2");
        //kirche.click();
        bundeslandSelect.selectByVisibleText("Niedersachsen");
        wohnortInputBox.sendKeys("26789");
        beruf.sendKeys("Software Tester");
        krankenkasseSelect.selectByVisibleText("gesetzlich versichert");
        berechnenButton.click();
    }



}
