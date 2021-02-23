package com.libraryCT.pages;

import com.libraryCT.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends PageBase {
    public LandingPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="user_count")  // or xpath = "//h2[.='2841']"
    public WebElement userCount;

}
