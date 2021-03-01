package com.libraryCT.step_definitions;

import com.libraryCT.pages.LibraryPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilites.BrowserUtils;
import com.libraryCT.utilites.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class TC03_SeeModulesDefinitions {

   LoginPage loginPage=new LoginPage();
LibraryPage libraryPage=new LibraryPage();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(loginPage.url);
    }
    @Given("the {string} on the home page")
    public void the_on_the_home_page(String role) {
        loginPage.login(role);
    }

    @Then("the user should see following modules")
    public void the_user_should_see_following_modules(List<String> modules) {
     List<String> actualResult=  BrowserUtils.getElementsText(libraryPage.links);
        Assert.assertTrue(modules.equals(actualResult));

        Driver.closeDriver();

    }


}
