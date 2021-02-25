package com.libraryCT.pages;

import com.libraryCT.utilites.BrowserUtils;
import com.libraryCT.utilites.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class LibraryPage extends LoginPage {

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement headerLink;

    @FindBy(xpath = "//ul[@id='menu_item']//li//a")
    public List<WebElement> links;

    @FindBy(id = "navbarDropdown")
    public WebElement logOutDropDown;

    @FindBy(linkText = "Log Out")
    public WebElement logOutLink;


    @FindBy(xpath = "//section[@id='users']//a[contains(text(),' Add User')]")
    public WebElement addUserButton;

    @FindBy(xpath = "//input")
    public List<WebElement> allLabelButtons;

    @FindBy(id = "address")
    public WebElement addressInput;

    @FindBy(xpath = "//div[@class='modal-footer']//button")
    public List<WebElement> closeOrSave;

    @FindBy(xpath = "//tbody//a")
    public List<WebElement> editUser;

    @FindBy(xpath = "//h5[@class='modal-title']")
    public WebElement addUserHeader;

    @FindBy(xpath = "//tbody//td[3]")
    public List<WebElement> allNames;

    @FindBy(xpath = "//tbody//td//a")
    public List<WebElement> allEditUserButton;


    public void logOut() {
        logOutDropDown.click();
        logOutLink.click();
    }


    public void clickModule(String module) {
        for (WebElement element : links) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            if (element.getText().equals(module)) {
                element.click();
            }
        }
    }

    public void addUser(String module, String information) {

        for (WebElement element : allLabelButtons) {
            if (element.getAttribute("placeholder").equals(module)) {
                element.sendKeys(information);

            }
        }
    }
}
