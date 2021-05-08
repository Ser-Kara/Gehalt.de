package de.gehalt.pages;

import de.gehalt.utilities.BrowserUtils;
import de.gehalt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {


    @FindBy(xpath = "//a/span[text()='Login']")
    public  WebElement loginMenuButton;

    @FindBy(xpath = "//ul[@class='o-nav']/li/a")
    public List<WebElement> pages;


    public void navigateTo(String pageName){
       BrowserUtils.waitFor(3);
        List<WebElement> mainPages = pages;
        for (WebElement page : mainPages) {
            if(page.getText().equals(pageName)){
                page.click();
                break;
            }

        }
    }

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}