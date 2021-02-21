package com.libraryCT.step_definitions;


import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilites.ConfigurationReader;
import com.libraryCT.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout_Step_Definitions {

    LoginPage loginPage= new LoginPage();


    @Given("user is on the home page")
    public void user_is_on_the_home_page() {

    loginPage.studentLogin();


    }


    @When("user logs out from application")
    public void user_logs_out_from_application() {


    }
    @Then("Message displayed Logout successfully")
    public void message_displayed_logout_successfully() {

    }
    @Then("Browser quit by driver")
    public void browser_quit_by_driver() {

    }

}
