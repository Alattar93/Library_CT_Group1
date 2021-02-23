package com.libraryCT.step_definitions;

import com.libraryCT.pages.LandingPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.UsersPage;
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

public class ShowRecords_StepDefinitions {

    LandingPage landingPage = new LandingPage();
    UsersPage usersPage = new UsersPage();
    Select select;


    LoginPage loginPage = new LoginPage();
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

            case "dashboard" : landingPage.dashboardPageLink.click();
                break;

            case "users" : landingPage.usersPageLink.click();
                break;

            case "books": landingPage.booksPageLink.click();
                break;
        }
    }
    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer expected) {

        select = new Select(usersPage.showRecordsDropDown);
        // System.out.println(select.getFirstSelectedOption().getText());
        String actual = select.getFirstSelectedOption().getText();

        Assert.assertEquals(expected+"",actual);         // second way convert int to string



    }
    @Then("show records should have following options")
    public void show_records_should_have_following_options(List<String> options) {
        //  System.out.println("options.size() = " + options.size());
        //  System.out.println("options = " + options);

        select = new Select(usersPage.showRecordsDropDown);

        List<WebElement> webElements = select.getOptions();

        List<String> actualText = BrowserUtils.getElementsText(webElements);

        Assert.assertEquals(options,actualText);
    }
}
