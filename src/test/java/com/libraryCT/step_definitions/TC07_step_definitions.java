package com.libraryCT.step_definitions;

import com.libraryCT.pages.LibraryPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilites.BrowserUtils;
import com.libraryCT.utilites.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.util.List;

public class TC07_step_definitions {
    LibraryPage libraryPage = new LibraryPage();
    Select select;

    @When("I login as {string}")
    public void iLoginAs(String student) {
        System.out.println("Step 1");

        libraryPage.login(student);


    }

    @Then("I should be able to go to {string} dropdown button")
    public void iShouldBeAbleToGoToDropdownButton(String bookCategories) {
        System.out.println("Step 2: I should be able to go to " + bookCategories + " dropdown button");


        select = new Select(libraryPage.bookCategories);
    }


    @Then("I should see all types of the book categories below:")
    public void i_should_see_all_types_of_the_book_categories_below(List<String> expectedBooksList) {
        System.out.println("Step 3: I should see all types of the book categories below:" + expectedBooksList);


        List<WebElement> list = select.getOptions();
        List<String> actual = BrowserUtils.getElementsText(list);


        Assert.assertEquals("Books Categories are NOT matched with expected names", expectedBooksList, actual);
    }


}
