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


public class Step_Definitions_TC05_TC10 {

    LoginPage loginPage = new LoginPage();
    LibraryPage libraryPage =new LibraryPage();
    UserPage userPage = new UserPage();
    Select select;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }




    @Given("User login as a {string}")
    public void user_login_as_a(String role) {


        String userName = "";
        String password = "";
        switch (role) {
            case "student":
                userName = ConfigurationReader.getProperty("student133Email");
                password = ConfigurationReader.getProperty("student133Pass");
                break;
            case "librarian":
                userName = ConfigurationReader.getProperty("librarianEmail");
                password = ConfigurationReader.getProperty("librarianPass");
                break;
        }

        loginPage.emailAddress.sendKeys(userName);
        loginPage.password.sendKeys(password);
        loginPage.signInButton.click();


    }
    @When("User is on {string} module")
    public void user_is_on_module(String module) {

        switch (module) {
            case "Dashboard":
               libraryPage.dashboardPageLink.click();
                break;

            case "Users":
                libraryPage.usersPageLink.click();
                break;

            case "Books":
                libraryPage.booksPageLink.click();

        }


    }

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer expected) {
        select = new Select(userPage.showDropDown);
        // System.out.println(select.getFirstSelectedOption().getText());
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actual,String.valueOf(expected));    //first way convert int to string

    }



    @When("User clicks {string} dropdown")
    public void user_clicks_dropdown(String dropDown) {

        switch (dropDown) {

            case "User Group":
                userPage.userGroupDropdown.click();
                break;
            case "Status":
                userPage.statusDropdown.click();
                break;
        }

    }

    @Then("User should see the following dropdown options:")


    @Then("User should see the following dropdown options on {string} dropDown:")
    public void user_should_see_the_following_dropdown_options_on_drop_down(String dropDown,List<String> expectedDropdownOptions) {
        switch (dropDown) {

            case "User Group":
                select = new Select(userPage.userGroupDropdown);

                break;
            case "Status":
                select = new Select(userPage.statusDropdown);

                break;

            case "Show":
                select = new Select(userPage.showDropDown);

        }



        List<WebElement> actualWebElements = select.getOptions();


        List<String> actualDropDownOptions = BrowserUtils.getElementsText(actualWebElements);

        System.out.println("expectedDropdownOptions = " + expectedDropdownOptions);
        System.out.println("actualDropDownOptions = " + actualDropDownOptions);
        Assert.assertEquals("DropDown options are different", expectedDropdownOptions, actualDropDownOptions);

        Driver.closeDriver();
    }


    @Then("Default records dropdown value is {string}")
    public void default_records_dropdown_value_is(String expectedRecordsNum) {
        select = new Select(userPage.showDropDown);

        String actualRecordsNum = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actualRecordsNum, expectedRecordsNum);

        System.out.println("expectedRecordsNum = " + expectedRecordsNum);
        System.out.println("actualRecordsNum = " + actualRecordsNum);

        Driver.closeDriver();

    }


}
