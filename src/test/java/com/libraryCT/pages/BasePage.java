package com.libraryCT.pages;

import com.libraryCT.utilites.BrowserUtils;
import com.libraryCT.utilites.ConfigurationReader;
import com.libraryCT.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class BasePage {

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

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String studentEmail = ConfigurationReader.getProperty("student133Email");
        String studentPass = ConfigurationReader.getProperty("student133Pass");
        emailAddress.sendKeys(studentEmail);
        password.sendKeys(studentPass);
        BrowserUtils.sleep(1);
        signInButton.click();

    }

    public void librarianLogin() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String librarianEmail = ConfigurationReader.getProperty("librarianEmail");
        String librarianPass = ConfigurationReader.getProperty("librarianPass");
        emailAddress.sendKeys(librarianEmail);
        password.sendKeys(librarianPass);
        BrowserUtils.sleep(1);
        signInButton.click();

    }
}
