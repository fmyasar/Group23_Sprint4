package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.Profile;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfileDef extends BasePage{

    @Given("user go to Dashboard")
    public void user_go_to_Dashboard() {
        // Write code here that turns the phrase above into concrete actions
        String username = ConfigurationReader.get("helpdesk_username");
        String password = ConfigurationReader.get("helpdesk_password");
        String url = ConfigurationReader.get("url");
        LoginPage loginPage = new LoginPage();
        Driver.get().get(url);
        loginPage.login(username,password);
    }

    @When("click username icon")
    public void click_username_icon() {
        // Write code here that turns the phrase above into concrete actions
        userName.click();
    }

    @When("click Edit Profile Settings")
    public void click_Edit_Profile_Settings() {
        // Write code here that turns the phrase above into concrete actions
        editProfile.click();
    }

    @Then("user should be able to see Edit Profile Page")
    public void user_should_be_able_to_see_Edit_Profile_Page() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(Driver.get().getTitle().contains("Edit User Profile"));
    }

    @When("click My Profile")
    public void click_My_Profile() {
        // Write code here that turns the phrase above into concrete actions
        myProfile.click();
    }


    @Then("user should be able to see My Profile Page")
    public void user_should_be_able_to_see_My_Profile_Page() {
        // Write code here that turns the phrase above into concrete actions
        String username = ConfigurationReader.get("helpdesk_username");
        Assert.assertTrue(Driver.get().getTitle().contains(username));
    }

}