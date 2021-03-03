package com.nextbasecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Profile{

    // user profile
    @FindBy(xpath = "//*[@id=\"user-name\"]")
    public static WebElement profileBtn;

    // my profile
    @FindBy(className = "menu-popup-item-text")
    public static WebElement myProfile;

    // profile edit
    @FindBy(xpath = "//span[contains(text(),\"Edit Profile\")]")
    public static WebElement editProfile;
}