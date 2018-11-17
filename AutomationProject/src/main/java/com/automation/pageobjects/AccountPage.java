package com.automation.pageobjects;

import com.automation.model.MenuType;
import com.automation.model.SubMenuType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToMenu(MenuType menuType) {
        getMenu(menuType.toString()).click();
    }

    public void navigateToSubMenu(MenuType menuType, SubMenuType subMenuType) {
        navigateToMenu(menuType);
        getSubMenu(subMenuType.toString()).click();
    }

    private WebElement getMenu(String text) {
        return driver.findElement(By.xpath(String.format("//span[contains(text(),'%s')]", text)));
    }

    private WebElement getSubMenu(String text) {
        return driver.findElement(By.xpath(String.format("//li[@id='menu_pb_active']//li[@class='k-item k-state-default']//span[contains(text(),'%s')]", text)));
    }
}
