package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilites.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class TC3_SeeModulesDefinitions {

   LoginPage loginPage=new LoginPage();


    @Given("the {string} on the home page")
    public void the_on_the_home_page(String role) {
        loginPage.login(role);
    }

    @Then("the user should see following modules")
    public void the_user_should_see_following_modules(List<String> modules) {
        loginPage.verifyModules(modules);
        Driver.closeDriver();

    }

}
