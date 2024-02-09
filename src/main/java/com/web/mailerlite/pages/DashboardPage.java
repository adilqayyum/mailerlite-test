package com.web.mailerlite.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static com.web.mailerlite.infra.BaseClass.wait;

public class DashboardPage {

    @FindBy(xpath = "//span[contains(text(),'Subscribers')]")
    private WebElement subscribers;
    @FindBy(xpath = "//span[contains(text(),'Automation')]")
    private WebElement automation;
    @FindBy(xpath = "//span[contains(text(),'Groups')]")
    private WebElement groups;
    @FindBy(xpath = "//span[contains(text(),' More ')]")
    private WebElement moreButton;
    @FindBy(xpath = "//span[contains(text(),' Delete ')]")
    private WebElement deleteButton;
    @FindBy(xpath = "//h2[.=' Please confirm ']")
    private WebElement popUpHeading;
    @FindBy(xpath = "//div[.='Are you sure you want to delete group: Test Group?']")
    private WebElement popUpMessage;


    public boolean isSubscriberGroupPresent(){
        wait.until(ExpectedConditions.elementToBeClickable(subscribers));
        subscribers.click();
        return groups.isDisplayed();
    }

    public DashboardPage clickOnGroups(){
        wait.until(ExpectedConditions.elementToBeClickable(groups));
        groups.click();
        return this;
    }

    public DashboardPage clickOnMore(){
        wait.until(ExpectedConditions.elementToBeClickable(moreButton));
        moreButton.click();
        return this;
    }

    public DashboardPage clickOnDelete(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
        deleteButton.click();
        return this;
    }

    public boolean isPopUpHeadingPresent(){
        wait.until(ExpectedConditions.visibilityOf(popUpHeading));
        return popUpHeading.isDisplayed();
    }

    public boolean isPopUpMessagePresent(){
        wait.until(ExpectedConditions.visibilityOf(popUpMessage));
        return popUpMessage.isDisplayed();
    }


}
