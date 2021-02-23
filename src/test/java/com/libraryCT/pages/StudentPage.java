package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StudentPage extends BasePage{

    @FindBy(xpath = "//ul[@id='menu_item']//li")
    public List<WebElement> links;

    @FindBy(xpath = "//a[@id='navbarDropdown']")
    public WebElement logOutDropDown;


    @FindBy(linkText = "Log Out")
    public WebElement logOutLink;

    public void logOut(){
        logOutDropDown.click();
        logOutLink.click();
    }
}



