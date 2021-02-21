package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilites.ConfigurationReader;
import com.libraryCT.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.ConcurrentModificationException;

public class Login_step_definitions {

    LoginPage loginPage=new LoginPage();

    @Given("the user login as a {string}")
    public void the_user_login_as_a(String role) {
        loginPage.login(role);


    }



    @Then("the user on  {string}")
    public void the_user_on(String dashboard) {


    }


}
