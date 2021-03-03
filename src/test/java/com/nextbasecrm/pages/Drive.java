package com.nextbasecrm.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Drive extends BasePage {
    //my drive button
    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[1]")
    public WebElement myDrive;
    //company drive button
    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[3]")
    public WebElement companyDrive;
    //my drive text
    @FindBy(css = "#pagetitle")
    public WebElement pageTitle;
}