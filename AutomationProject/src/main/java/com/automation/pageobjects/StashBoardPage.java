package com.automation.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StashBoardPage extends BasePage {

    @FindBy(xpath = "//div[@id='new']//span[@class='col-sm-10']//a[@data-bind='click: createNewTask, visible: showGroupAndCreateBtn']")
    WebElement createTaskButton;

    @FindBy(xpath = "//h2[contains(text(),'Statement Dashboard')]")
    WebElement heading;

    public StashBoardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        waitFor(createTaskButton, 10);
        Assert.assertTrue("Header not found", getHeading().isDisplayed());
    }

    private WebElement getHeading() {
        return heading;
    }

    public UploadFilePage createTask () {
        createTaskButton.click();
        return new UploadFilePage(driver);
    }
}
