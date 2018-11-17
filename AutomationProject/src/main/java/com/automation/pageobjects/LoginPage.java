package com.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/form/div[1]/div/input")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/form/div[2]/div/input")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/form/div[3]/div/button")
    WebElement signInBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getUserName() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    WebElement getSignInButton() {
        return signInBtn;
    }

    public void logIn(String userName, String password) {
        getUserName().sendKeys(userName);
        getPassword().sendKeys(password);
        getSignInButton().click();
    }
}
