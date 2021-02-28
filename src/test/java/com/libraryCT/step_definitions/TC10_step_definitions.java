package com.libraryCT.step_definitions;

import com.libraryCT.pages.LibraryPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilites.BrowserUtils;
import com.libraryCT.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class TC10_step_definitions {
LoginPage log = new LoginPage();
LibraryPage libraryPage = new LibraryPage();

    @Given("the user{string} on the homepage")
    public void theUserOnTheHomepage(String arg0) {


        log.librarianLogin();
    }






    @When("the user click users module")
    public void the_user_click_users_module() {
        libraryPage.userModule.click();

    }
    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> dataTable) {

      List<String> actualNames = BrowserUtils.getElementsText(libraryPage.moduleNames);

        Assert.assertTrue(actualNames.equals(dataTable));
        Driver.closeDriver();

    }


}
