package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends LoginPage {

    @FindBy(name="tbl_users_length")
    public WebElement showRecordsDropDown;

    @FindBy(id="user_groups")
    public WebElement userGroupDropdown;


    @FindBy(id="user_status")
    public WebElement statusDropdown;
}
