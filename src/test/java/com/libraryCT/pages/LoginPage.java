package com.libraryCT.pages;

import com.libraryCT.utilites.BrowserUtils;
import com.libraryCT.utilites.ConfigurationReader;
import com.libraryCT.utilites.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class LoginPage extends BasePage{
    // Hello Group 1public LoginPage() {


    @FindBy(id = "inputEmail")
    public WebElement emailAddress;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;





    String librarianEmail = ConfigurationReader.getProperty("librarianEmail");
    String librarianPass = ConfigurationReader.getProperty("librarianPass");

    String studentEmail = ConfigurationReader.getProperty("student133Email");
    String studentPass = ConfigurationReader.getProperty("student133Pass");

    public void studentLogin() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        emailAddress.sendKeys(studentEmail);
        password.sendKeys(studentPass);
        BrowserUtils.sleep(1);
        signInButton.click();

    }

    public void librarianLogin() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        emailAddress.sendKeys(librarianEmail);
        password.sendKeys(librarianPass);
        BrowserUtils.sleep(1);
        signInButton.click();

    }

    public void login(String role) {

        switch (role) {

            case "librarian":
                Driver.getDriver().get(ConfigurationReader.getProperty("url"));
                System.out.println("I log in as a Librarian.");
                emailAddress.sendKeys(librarianEmail);
                password.sendKeys(librarianPass, Keys.ENTER);
                break;

            case "student":
                Driver.getDriver().get(ConfigurationReader.getProperty("url"));
                System.out.println("I log in as a Student.");
                emailAddress.sendKeys(studentEmail);
                password.sendKeys(studentPass, Keys.ENTER);
                break;

        }
    }
}
