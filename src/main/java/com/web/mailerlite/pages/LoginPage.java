package com.web.mailerlite.pages;

import com.web.mailerlite.infra.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BaseClass {

    @FindBy(xpath="//input[@id='email']")
    private WebElement emailField;
    @FindBy(xpath="//input[@id='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    private WebElement signIn;
    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    private WebElement dashboardButton;

    public LoginPage enterEmailField(String emailText) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(emailText);
        return this;
    }

    public LoginPage enterPasswordField(String passwordText){
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(passwordText);
        return this;
    }

    public LoginPage clickSignIn(){
        wait.until(ExpectedConditions.elementToBeClickable(signIn));
        signIn.click();
        return this;
    }

    public boolean isDashboardPresent(){
        wait.until(ExpectedConditions.visibilityOf(dashboardButton));
        return dashboardButton.isDisplayed();
    }
}
