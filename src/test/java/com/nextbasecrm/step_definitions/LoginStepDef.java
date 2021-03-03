package com.nextbasecrm.step_definitions;
import com.nextbasecrm.pages.ActivityStream;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.Map;
public class LoginStepDef {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("the user logs in as {string}")
    public void the_user_logs_in_as(String userType) {
        LoginPage loginPage = new LoginPage();
        String username = null;
        String password = null;
        switch (userType.toLowerCase()) {
            case "hr":
                username = ConfigurationReader.get("humanresource_username");
                password = ConfigurationReader.get("humanresource_password");
                break;
            case "helpdesk":
                username = ConfigurationReader.get("helpdesk_username");
                password = ConfigurationReader.get("helpdesk_password");
                break;
            case "marketing":
                username = ConfigurationReader.get("marketing_username");
                password = ConfigurationReader.get("marketing_password");
                break;
        }
        loginPage.login(username, password);
    }
    @Then("the user should be able to see Activity Stream page")
    public void the_user_should_be_able_to_see_Activity_Stream() {
        ActivityStream activityStream = new ActivityStream();
        Assert.assertTrue(activityStream.activityStream.isDisplayed());
    }
    //-----------------------------------------------------------------------------------//
    @When("the user logs in with following credentials")
    public void the_user_logs_in_with_following_credentials(Map<String, String> credentials) {
        LoginPage loginPage = new LoginPage();
        String username = credentials.get("username");
        String password = credentials.get("password");
        if(username == null){
            username = "";
        }
        if(password == null){
            password = "";
        }
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginBtn.click();
    }
    @Then("the user should see an error message")
    public void the_user_should_see_an_error_message() {
        Assert.assertTrue(new LoginPage().errorMessage.isDisplayed());
    }
}