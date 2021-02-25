package com.libraryCT.step_definitions;

import com.libraryCT.pages.LibraryPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.UserPage;
import com.libraryCT.utilites.BrowserUtils;
import com.libraryCT.utilites.ConfigurationReader;
import com.libraryCT.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class ShowRecords_StepDefinitions_TC05 {

    LoginPage loginPage = new LoginPage();
    LibraryPage libraryPage =new LibraryPage();
    UserPage userPage = new UserPage();
    Select select;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }




    @Given("I login as librarian")
    public void i_login_as_librarian() {
        loginPage.librarianLogin();
    }
    @When("I click {string} link")
    public void i_click_link(String link) {
        switch (link.toLowerCase()){

            case "dashboard" : libraryPage.dashboardPageLink.click();
                break;

            case "users" : libraryPage.usersPageLink.click();
                break;

            case "books": libraryPage.booksPageLink.click();
                break;
        }


    }

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer expected) {
        select = new Select(userPage.showRecordsDropDown);
        // System.out.println(select.getFirstSelectedOption().getText());
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actual,String.valueOf(expected));    //first way convert int to string

    }

    @Then("show records should have following options")
    public void show_records_should_have_following_options(List<String> options) {
        select = new Select(userPage.showRecordsDropDown);

        List<WebElement> webElements = select.getOptions();

        List<String> actualText = BrowserUtils.getElementsText(webElements);

        Assert.assertEquals(options,actualText);

        System.out.println("options = " + options);
        System.out.println("actualText = " + actualText);
    }

}
