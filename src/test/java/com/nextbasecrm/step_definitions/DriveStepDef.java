package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.Drive;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DriveStepDef {


    @When("the user click Drive button on Activity Stream menu")
    public void the_user_click_Drive_button_on_Activity_Stream_menu(){
        new Drive().drive.click();
    }

    @When("the user click My Drive button")
    public void the_user_click_My_Drive_button() {

        new Drive().myDrive.click();
    }

    @Then("the user displays My Drive window")
    public void the_user_displays_My_Drive_window() {

        Assert.assertEquals("My Drive",new Drive().pageTitle.getText());
    }

    @When("the user click Company Drive button")
    public void the_user_click_Company_Drive_button() {

        new Drive().companyDrive.click();
    }

    @Then("the user displays Company Drive window")
    public void the_user_displays_Company_Drive_window() {

        Assert.assertEquals("Company drive",new Drive().pageTitle.getText());
    }


}
