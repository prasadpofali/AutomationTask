package com.automation.step_definitions;

import com.automation.model.MenuType;
import com.automation.model.SubMenuType;
import com.automation.pageobjects.AccountPage;
import com.automation.pageobjects.LoginPage;
import com.automation.pageobjects.StashBoardPage;
import com.automation.pageobjects.UploadFilePage;
import com.automation.util.PropertiesUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    WebDriver driver;

    @Before
    public void setupEnvironment() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://staging-engine.kurtosys.org");
    }

    @Given("^Canopy homepage is loaded")
    public void canopyHomePageIsLoaded() {
    }

    @When("^navigated to Canopy Homepage$")
    public void navigatedToCanopyHomepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println();
    }

    @Then("^title of homepage should show$")
    public void titleOfHomepageShouldShow() throws Throwable {
        String actualTitle = driver.getTitle();
        if (actualTitle.contentEquals("Login [Staging] - Canopy Engine")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        ;
    }

    @Then("^User should be able to log in$")
    public void userShouldBeAbleToLogIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PropertiesUtil propertiesUtil = new PropertiesUtil("creds");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logIn(propertiesUtil.getPropertyAsString("userName"), propertiesUtil.getPropertyAsString("password"));
        //Verifying that the user is landed to the page after logged in successfully.
        Assert.assertEquals("Not landed to the expected page", "Help [Staging] - Canopy Engine", driver.getTitle());
    }

    @After
    public void cleanUp() {
        System.out.println("After method executing");
        driver.close();
    }

    @Given("^User is logged in$")
    public void userIsLoggedIn() throws Throwable {
        userShouldBeAbleToLogIn();
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Not landed to the expected page", "Help [Staging] - Canopy Engine", driver.getTitle());
    }

    @When("^navigated to Stashboard$")
    public void navigatedToStashboard() throws Throwable {
        //Click on FILE DATA EXTRACTION
        AccountPage accountPage = new AccountPage(driver);
        //To open Stashboard menu, open FILE DATA EXTRACTION menu first
        accountPage.navigateToSubMenu(MenuType.FILE_DATA_EXTRACTION, SubMenuType.STASHBOARD);
    }

    @Then("^Stashboard should be displayed$")
    public void stashboardShouldBeDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Done Execution.");
    }

    @And("^Created a new task$")
    public void createdANewTask() throws Throwable {
        StashBoardPage stashBoardPage = new StashBoardPage(driver);
        UploadFilePage uploadFilePage = stashBoardPage.createTask();
        uploadFilePage.uploadFile();

        uploadFilePage.selectAccount();
        System.out.println("Found");

//        uploadFilePage.uploadAndCreateTask();
    }
}
