package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserPage_default_stp_definition {

    LoginPage loginPage=new LoginPage();
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {

        System.out.println("User is on a login page");
    }

    @And("I login as librarian")
    public void iLoginAsLibrarian() {
        loginPage.librarianLogin();
    }

    @When("I click {string} link")
    public void iClickLink(String string) {


    }

    @Then("show records default value should be {int}")
    public void showRecordsDefaultValueShouldBe(int arg0) {
    }

    @And("show records should have following options")
    public void showRecordsShouldHaveFollowingOptions() {
    }
}
