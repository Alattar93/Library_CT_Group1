package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LibraryPage extends BasePage{
    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement headerLink;

    @FindBy(xpath = "//ul[@id='menu_item']//li//a")
    public List<WebElement> links;

    @FindBy(id = "navbarDropdown")
    public WebElement logOutDropDown;


    @FindBy(linkText = "Log Out")
    public WebElement logOutLink;

    public void logOut(){
        logOutDropDown.click();
        logOutLink.click();
    }


}
