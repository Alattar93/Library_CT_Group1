package com.libraryCT.pages;

import com.libraryCT.utilites.ConfigurationReader;
import com.libraryCT.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailAddress;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;


    public void studentLogin() {
        String studentEmail = ConfigurationReader.getProperty("student133Email");
        String studentPass = ConfigurationReader.getProperty("student133Pass");
        emailAddress.sendKeys(studentEmail);
        password.sendKeys(studentPass);
        signInButton.clear();

    }

    public void librarianLogin() {
        String librarianEmail = ConfigurationReader.getProperty("librarianEmail");
        String librarianPass = ConfigurationReader.getProperty("OPhunod4");
        emailAddress.sendKeys(librarianEmail);
        password.sendKeys(librarianPass);
        signInButton.clear();

    }
}