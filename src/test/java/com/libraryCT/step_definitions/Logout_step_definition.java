package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout_step_definition {
    LoginPage log = new LoginPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        log.studentLogin();
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
