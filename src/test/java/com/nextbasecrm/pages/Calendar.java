package com.nextbasecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calendar extends BasePage{

    //Top side elements
    // My Calendar
    @FindBy(id= "top_menu_id_calendar_menu_my_calendar")
    public WebElement myCalendar;

    // Company Calendar
    @FindBy (id = "top_menu_id_calendar_menu_company_calendar")
    public WebElement companyCalendar;

    // More Button
    @FindBy (id="top_menu_id_calendar_more_button")
    public WebElement moreButton;

    // Search Bar
    @FindBy (xpath="//*[@placeholder='Filter and search']")
    public WebElement searchBar;

    // Calendars
    @FindBy (xpath="//button[contains(text(), 'Calendars')]")
    public WebElement calendars;

    // Synchronize
    @FindBy (xpath= "//*[@class='ui-btn ui-btn-icon-business ui-btn-light-border ui-btn-themes']")
    public WebElement synchronize;

    // Settings
    @FindBy (xpath = "//*[@class='ui-btn ui-btn-icon-setting ui-btn-light-border ui-btn-themes']")
    public WebElement settings;

    // Add
    @FindBy (xpath="//*[@class='ui-btn-main']")
    public WebElement add;

    // Day
    @FindBy (xpath= "//*[@data-bx-calendar-view='day']")
    public WebElement day;

    // Week
    @FindBy (xpath= "//*[@data-bx-calendar-view='week']")
    public WebElement week;

    // Month
    @FindBy (xpath= "//*[@data-bx-calendar-view='month']")
    public WebElement month;

    // Schedule
    @FindBy (xpath="//span[@data-bx-calendar-view='list']")
    public WebElement schedule;

    // page title
    @FindBy (css = "span#pagetitle")
    public WebElement pageTitle;

//    // Add Event under Add++
//    @FindBy ()
//    public WebElement addEvent;
//
//    // New Task under Add
//    @FindBy ()
//    public WebElement newTask;
//
//    // Configure Menu under More Button
//    @FindBy ()
//    public WebElement configureMenuUnderMore;
//
//    // Reset Menu under More Button
//    @FindBy ()
//   // public WebElement resetMenu;

}
