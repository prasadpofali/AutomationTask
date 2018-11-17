package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    public static WebDriver driver;
    public static boolean bResult;
    long waitTimeOut = 50;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        BasePage.bResult = true;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, waitTimeOut);
    }

    public static void goToUrl(String url) {
        driver.get(url);
    }

    public void waitFor(String locator) {
        System.out.println("Wait for");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void waitFor(WebElement element, int durationInSeconds) {
        wait = new WebDriverWait(driver, durationInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}