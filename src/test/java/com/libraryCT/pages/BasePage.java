package com.libraryCT.pages;

import com.libraryCT.utilites.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);}




    public void currentUrl(String expectedHeader){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expectedHeader));

        String actualResult=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualResult.contains(expectedHeader));

    }


}
