package com.automation.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;

public class UploadFilePage extends BasePage {

    Logger logger = Logger.getLogger(UploadFilePage.class.getName());

    private By descendingArrowLocator = By.xpath("(//thead[@class='tableFloatingHeaderOriginal']//th[@data-title='Task Name'][@data-role='columnsorter']//span[@class='k-icon k-i-sort-desc-sm'])[1]");

    private final String viewTaskDetailsBtnLocator = "(//stashboard-task-grid-component//tbody[@role='rowgroup']//tr[%s]/descendant::button[@title='View Task Details'])[1]";

    private final String narrationColumnLocator = "//div[@id='transactions']//tbody[@role='rowgroup']//tr[%s]/td[12]";

    private final String ccyAccountCodeText = "//div[@id='transactions']//tbody[@role='rowgroup']//tr[%s]/td[8]";

    private final String checkBoxLocator = "//div[@id='transactions']//tbody[@role='rowgroup']//tr[%s]//input[contains(@type,'checkbox')]";

    private final String dateFieldLocator = "//div[@id='transactions']//tbody[@role='rowgroup']//tr[%s]/td[10]";

    @FindBy(xpath = "//input[@type='file']")
    WebElement chooseFileButton;

    @FindBy(xpath = "//label[contains(text(),'Account')]/following::span[1][@role='listbox']")
    WebElement accountSpinner;

    @FindBy(xpath = "//h3[contains(text(),'Upload File(s)')]")
    WebElement pageHeader;

    @FindBy(xpath = "//button[contains(text(),'Close')]")
    WebElement closeButton;

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    WebElement okButton;

    @FindBy(xpath = "//div[@class='k-animation-container']//ul/li[text()='at_parent_account']")
    WebElement atParentAccount;

    @FindBy(xpath = "//input[@value='Upload File(s) and Create Task']")
    WebElement uploadAndSubmitBtn;

    @FindBy(xpath = "//div[@id='new']//thead[@class='tableFloatingHeaderOriginal']//th//input[@data-text-field='parentAccount']")
    WebElement parentAccountFilter;

    @FindBy(xpath = "//div[@id='new']//tbody[@role='rowgroup']//tr")
    List<WebElement> tableRows;

    @FindBy(xpath = "//thead[@class='tableFloatingHeaderOriginal']//th[@data-title='Most Recent Date Received'][@data-role='columnsorter']")
    WebElement recentDateSorter;

    @FindBy(xpath = "//div[@id='new']//thead[@class='tableFloatingHeaderOriginal']//th//input[@data-text-field='taskOwnerList']")
    WebElement taskOwnerSorter;

    @FindBy(xpath = "(//thead[@class='tableFloatingHeaderOriginal']//th[@data-title='Task Name'][@data-role='columnsorter'])[1]")
    WebElement taskNameBtn;

    @FindBy(xpath = "//div[@id='stashboardGrid']//div[@class='k-pager-wrap k-grid-pager pagerTop k-widget k-floatwrap']//a[@title='Refresh']")
    WebElement refreshBtn;

    @FindBy(xpath = "//a[@class='statement-exception-open-link']")
    WebElement exceptionLink;

    @FindBy(xpath = "//button[contains(text(),'Continue Processing & Cancel Old Job')]")
    WebElement continueProcessingCancelOldJobBtn;

    @FindBy(xpath = "//div[@id='stashboardGrid']//div[@class='k-pager-wrap k-grid-pager pagerTop k-widget k-floatwrap']//span[@class='k-icon k-i-reload']")
    WebElement reloadButton;

    @FindBy(xpath = "//a[@class='statement-exception-open-link'][text()='Review Validation Error']")
    WebElement reviewValidationError;

    @FindBy(xpath = "//button[contains(text(),'View to Resolve')]")
    WebElement viewToResolveButton;

    @FindBy(xpath = "//span[@class='k-icon k-i-sort-asc-sm']")
    List<WebElement> ascendingOrderSorter;

    @FindBy(xpath = "//th[@id='normalizedTransactionsGrid_active_cell']//a[contains(@class,'k-link')][contains(text(),'Narration')]")
    WebElement narrationButton;

    @FindBy(xpath = "//div[@id='transactions']//tbody[@role='rowgroup']//tr")
    List<WebElement> transactionsRows;

    @FindBy(xpath = "//div[@id='normalizedTransactionsGrid']//span[contains(text(),'Bulk Change..')]")
    WebElement bulkDropDown;

    @FindBy(xpath = "//div[@id='normalizedTransactionsGrid']//span[contains(@class,'k-input')][contains(text(),'Bulk Change..')]")
    WebElement bulkChangeDropDown;

    @FindBy(xpath = "//div[contains(@class,'k-animation-container')]//li[contains(@class,'k-item')][contains(text(),'CCY Account Code')]")
    WebElement ccyAccountCode;

    @FindBy(xpath = "//span[contains(text(),'Select CCY Account..')]")
    WebElement ccyAccount;

    @FindBy(xpath = "//div[@id='types-list']//input[contains(@class,'k-textbox')]")
    WebElement ccyAccountNameTextField;

    @FindBy(xpath = "//div[@class='k-list-scroller']//li[text()='at_parent_account-test-01-usd-01']")
    WebElement atParentAccountTest01;

    @FindBy(xpath = "//div[@id='normalizedTransactionsGrid']//a[contains(@class,'k-button k-button-primary k-button-icontext')][contains(text(),'Bulk Change')]")
    WebElement normalizedBulkChange;

    @FindBy(xpath = "//div[@class='k-list-container k-popup k-group k-reset k-state-border-up']//ul[@class='k-list k-reset']")
    WebElement reset;

    @FindBy(xpath = "//div[@id='normalizedTransactionsGrid']//button[@class='k-button k-button-icontext k-grid-save-changes']")
    WebElement saveChangesButton;

    @FindBy(xpath = "//div[@id='transactions']//div[2]//div//button[contains(text(),'CCY Account Mapping')]")
    WebElement ccyAccountMapping;

    @FindBy(xpath = "//button[@type='button'][contains(text(),'Save')]")
    WebElement saveButton;

    @FindBy(xpath = "//th//input[@type='checkbox']")
    WebElement checkBoxButton;

    @FindBy(xpath = "//li[contains(text(),'Trade Date')]")
    WebElement tradeDateElement;

    @FindBy(id = "date")
    WebElement dateField;

    @FindBy(xpath = "//div[@data-role='validator']//span[@class='k-icon k-i-calendar']")
    WebElement calendarSpinner;

    @FindBy(xpath = "//a[@class='k-link k-nav-today']")
    WebElement todayLink;

    @FindBy(xpath = "//div[@id='normalizedTransactionsGrid']//a[contains(text(),'Bulk Change')]")
    WebElement bulkChangeButton;

    @FindBy(xpath = "//div[@data-bind='if: summary().isLoaded']//i[@class='fa fa-step-forward']")
    WebElement stepForwardButton;

    @FindBy(xpath = "//div[@id='transactions']//div//div//div[contains(@class,'col-sm-12')]//button[1]")
    WebElement nextButton;

    @FindBy(xpath = "//div[@class='k-state-selected']/span[@class='k-progress-status-wrap']/span[contains(text(), 'Status: TransactionsMigrated')]")
    WebElement transactionMigratedStatus;

    @FindBy(xpath = "(//div[@class='k-state-selected k-complete']//span[@class='k-progress-status-wrap']/span[contains(text(), 'Status: Completed')])[1]")
    WebElement completedStatus;

    @FindBy(xpath = "//div[@id='stashboardGrid']//tbody[@role='rowgroup']//tr[1]/td[5]//div/span/span")
    WebElement completedStatusField;

    public UploadFilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        waitFor(pageHeader, 10);
        Assert.assertTrue("Page not loaded", pageHeader.isDisplayed());
    }

    public void uploadFile() {
        System.out.println("Uploading file: " + System.getProperty("user.dir"));
        chooseFileButton.sendKeys(System.getProperty("user.dir") + "\\src\\main\\java\\com\\automation\\data\\Automation_Task_at_007.xlsx");
        System.out.println("Done uploading");
    }

    public void selectAccount() {
        System.out.println("Select Account");
        accountSpinner.click();
        waitFor(atParentAccount, 10);

        Actions actions = new Actions(driver);
        actions.moveToElement(atParentAccount);
        actions.perform();
        atParentAccount.click();

        actions.moveToElement(uploadAndSubmitBtn);
        actions.perform();
        uploadAndSubmitBtn.click();

        waitFor(okButton, 10);
        if (okButton.isDisplayed()) {
            okButton.click();
        }
        waitFor(closeButton, 10);
        actions.moveToElement(closeButton).click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(closeButton));
        waitFor(closeButton, 10);
        closeButton.click();

        parentAccountFilter.sendKeys("at_parent_account");
        recentDateSorter.click();
        recentDateSorter.click();

        taskOwnerSorter.sendKeys("at_007");
        taskOwnerSorter.sendKeys(Keys.RETURN);

        WebElement element2;
        try {
            element2 = driver.findElement(descendingArrowLocator);
            while (!element2.isDisplayed()) {
                taskNameBtn.click();
                element2 = driver.findElement(descendingArrowLocator);
            }
        } catch (Exception e) {
            taskNameBtn.click();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            taskNameBtn.click();
        }

        try {
            Thread.sleep(300);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int[] taskNames = new int[tableRows.size()];
        for (int i = 1; i <= tableRows.size(); i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
            Actions action = new Actions(driver);
            WebElement taskNameTd = driver.findElement(By.xpath(String.format("//div[@id='new']//tbody[@role='rowgroup']//tr[%s]//td[4]", i)));
            js.executeScript("window.scrollBy(0,150)");
            action.moveToElement(taskNameTd).perform();
            int task = Integer.parseInt(taskNameTd.getText().substring(1));

            taskNames[i - 1] = task;
        }
        int index = 1;
        for (int i = 1; i <= taskNames.length; i++) {
            index = taskNames[i - 1] > taskNames[index] ? i : index;
        }

        waitFor(driver.findElement(By.xpath(String.format(viewTaskDetailsBtnLocator, 1))), 2);

        boolean staleElement = true;
        while (staleElement) {

            try {

                System.out.println("Index : " + index);
                Actions action = new Actions(driver);
                WebElement element = driver.findElement(By.xpath(String.format(viewTaskDetailsBtnLocator, index)));
                webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
                action.moveToElement(element).click().perform();

                staleElement = false;
            } catch (StaleElementReferenceException ex) {
                staleElement = true;
                js.executeScript("window.scrollBy(0,300)");
            }
        }

        sleep(3000);

        js.executeScript("window.scrollTo(0,500)");
        driver.findElement(By.xpath(String.format(viewTaskDetailsBtnLocator, index))).click();
        waitFor(refreshBtn, 10);
        js.executeScript("window.scrollTo(0," + refreshBtn.getLocation().x + ")");
        refreshBtn.click();
        staleElement = true;
        while (staleElement) {

            try {

                Actions action = new Actions(driver);
                webDriverWait.until(ExpectedConditions.elementToBeClickable(refreshBtn));
                action.moveToElement(refreshBtn).click().perform();

                By openLink = By.xpath("//a[@class='statement-exception-open-link']");
                retryingFindClick(openLink);
                staleElement = false;
            } catch (StaleElementReferenceException ex) {
                staleElement = true;
                js.executeScript("window.scrollBy(0,300)");
            }
        }

        JavascriptExecutor jss = (JavascriptExecutor) driver;

        waitFor(continueProcessingCancelOldJobBtn, 10);
        continueProcessingCancelOldJobBtn.click();
        waitFor(okButton, 10);
        okButton.click();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int attempts = 0;
        while (attempts < 6) {
            try {
                reloadButton.click();
                Thread.sleep(1000);
                JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
                jsExecutor.executeScript("window.scrollBy(0,200)");
                waitFor(reviewValidationError, 1);
                reviewValidationError.click();
                break;
            } catch (Exception e) {
            }
            attempts++;
        }

        waitFor(viewToResolveButton, 2);
        viewToResolveButton.click();

        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        boolean isPresent = ascendingOrderSorter.size() > 0;
        while (!isPresent) {
            narrationButton.click();
            isPresent = ascendingOrderSorter.size() > 0;
        }
        int test1Index = 0;
        for (int i = 1; i <= transactionsRows.size(); i++) {
            WebElement eachRow = driver.findElement(By.xpath(String.format(narrationColumnLocator, i)));
            if (eachRow.getText().equals("test-1")) {
                driver.findElement(By.xpath(String.format(checkBoxLocator, i))).click();
                test1Index = i;
                break;
            }
        }

        bulkChangeDropDown.click();

        sleep(2000);

        ccyAccountCode.click();

        waitFor(ccyAccount, 2);
        ccyAccount.click();

        waitFor(ccyAccountNameTextField, 2);
        ccyAccountNameTextField.sendKeys("at_parent_account-test-01-usd-01");
        atParentAccountTest01.click();

        normalizedBulkChange.click();
        waitFor(okButton, 2);
        okButton.click();

        sleep(2000);

        String ccyAccountCode = driver.findElement(By.xpath(String.format(ccyAccountCodeText, test1Index))).getText();

        assert ccyAccountCode.equals("at_parent_account-test-01-usd-01");

        for (int i = 1; i <= transactionsRows.size(); i++) {
            WebElement eachRow = driver.findElement(By.xpath(String.format(narrationColumnLocator, i)));
            if (eachRow.getText().equals("test-2")) {

                wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(String.format(ccyAccountCodeText, i)))));
                sleep(500);
                driver.findElement(By.xpath(String.format(ccyAccountCodeText, i))).click();
                //Open the dropdown
                sleep(500);
                driver.findElement(By.xpath(String.format(ccyAccountCodeText, i))).click();
                sleep(500);
                driver.findElement(By.xpath(String.format(ccyAccountCodeText, i))).click();
                sleep(500);

                waitFor("//div[@class='k-list-container k-popup k-group k-reset k-state-border-up']//input[@class='k-textbox']");
                driver.findElement(By.xpath("//div[@class='k-list-container k-popup k-group k-reset k-state-border-up']//input[@class='k-textbox']"))
                        .sendKeys("at_parent_account-test-01-usd-01");
//                driver.findElement(By.xpath("//div[@class='k-list-scroller']//li[text()='at_parent_account-test-01-usd-01']")).click();

                sleep(1500);

                waitFor(reset, 2);
                reset.click();
                saveChangesButton.click();
                sleep(1500);

                assert driver.findElement(By.xpath(String.format(ccyAccountCodeText, i))).getText().equals("at_parent_account-test-01-usd-01");

                break;
            }
        }

        //Click on the tab CCY account mappings
        ccyAccountMapping.click();

        //Click on Save
        saveButton.click();

        //Click OK
        waitFor(okButton, 2);
        okButton.click();
        waitFor(transactionsRows.get(0), 5);
        for (int i = 1; i <= transactionsRows.size(); i++) {
            WebElement eachRow = driver.findElement(By.xpath(String.format(narrationColumnLocator, i)));
            if (eachRow.getText().equals("test-3")) {
                assert driver.findElement(By.xpath(String.format(ccyAccountCodeText, i))).getText().equals("at_parent_account-test-01-usd-02");
                break;
            }
        }
        //select all checkbox
        checkBoxButton.click();

        bulkDropDown.click();
        //In drop down, select “Trade Date”.
        actions.moveToElement(tradeDateElement);
        actions.click();
        sleep(1000);
        tradeDateElement.click();
        waitFor(dateField, 3);
        //Select sysdate from the date picker.
        calendarSpinner.click();
        waitFor(todayLink, 2);
        todayLink.click();

        bulkChangeButton.click();

        waitFor(okButton, 2);
        okButton.click();

        waitFor(transactionsRows.get(0), 2);
        for (int i = 1; i <= transactionsRows.size(); i++) {
//            WebElement eachRow = driver.findElement(By.xpath(String.format(dateFieldLocator, i)));
            String today = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
            String date = driver.findElement(By.xpath(String.format(dateFieldLocator, i))).getText();
            System.out.println(today + ":" + date);
            assert today.equals(date);
        }
        //Click on next button
        waitFor(stepForwardButton, 2);
        stepForwardButton.click();

        waitFor(transactionMigratedStatus, 3);

        nextButton.click();

        sleep(3000);

        nextButton.click();
        waitFor(completedStatus, 3);
        String status = completedStatus.getText();

        assert status.contains("Completed");

        driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);

        refreshBtn.click();
        waitFor(completedStatusField, 2);
        assert completedStatusField.getText().equalsIgnoreCase("Completed");
    }


    public boolean retryingFindClick(By by) {
        boolean result = false;
        int attempts = 0;
        while (attempts < 6) {
            try {
                JavascriptExecutor jss = (JavascriptExecutor) driver;
                jss.executeScript("window.scrollBy(0,300)");
                sleep(500);
                waitFor(exceptionLink, 10);
                exceptionLink.click();
                result = true;
                break;
            } catch (Exception e) {
            }
            attempts++;
        }
        System.out.println("Attempts = " + attempts);
        return result;
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, e.toString());
        }
    }
}
