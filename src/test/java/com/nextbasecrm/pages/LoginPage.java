package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMe;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    @FindBy(className = "login-link-forgot-pass")
    public WebElement forgotPassword;

    @FindBy(xpath = "//div[@class = 'errortext']")
    public WebElement errorMessage;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsHelpDesk(){

        String username = ConfigurationReader.get("helpdesk_username");
        String password = ConfigurationReader.get("helpdesk_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
    public void loginAsHumanResource(){

        String username = ConfigurationReader.get("humanresource_username");
        String password = ConfigurationReader.get("humanresource_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
    public void loginAsMarketing(){

        String username = ConfigurationReader.get("marketing_username");
        String password = ConfigurationReader.get("marketing_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }


}