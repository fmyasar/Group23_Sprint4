package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.Calendar;
import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarStepDef {

    @When("the user click the Calendar button on Activity Stream")
    public void the_user_click_the_Calendar_button_on_Activity_Stream() {
        new Calendar().calendar.click();
    }

    @When("the user click My Calendar button")
    public void the_user_click_My_Calendar_button() {
        new Calendar().myCalendar.click();

    }
    @Then("the user displays My Calendar")
    public void the_user_displays_My_Calendar() {
        Assert.assertEquals("Calendar", new Calendar().pageTitle.getText());
    }

    @And("the user click Company Calendar button")
    public void theUserClickCompanyCalendarButton() {

        new Calendar().companyCalendar.click();
    }

    @Then("the user displays Company Calendar")
    public void theUserDisplaysCompanyCalendar() {

        Assert.assertEquals("Event Calendar", new Calendar().pageTitle.getText());

    }
}