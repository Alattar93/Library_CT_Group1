package com.libraryCT.utilites;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static List<String> getElementsText(List<WebElement> webElementList){

        //Placeholder empty list of web element
        List<String> webElementsAsString = new ArrayList<>();

        //Looping through list of web elements and storing text into placeholder list
        for (WebElement each : webElementList) {
            webElementsAsString.add(each.getText());
        }

        //returning final List<String>
        return webElementsAsString;
    }




    /*
    Method to assert title
     */

    public static void titleVerification(String expectedTitle){

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));

        //return actualTitle.equals(expectedTitle);
    }




    //create method name: wait
    //converting milliseconds to seconds
    //handle checked exception

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");

        }
    }

}
