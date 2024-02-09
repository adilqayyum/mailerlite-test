package com.web.mailerlite.tests;

import com.web.mailerlite.pages.DashboardPage;
import com.web.mailerlite.pages.LoginPage;
import com.web.mailerlite.utils.readProperties;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WebAppTest extends BaseTest{

    @Test(priority = 1)
    public void testLogin() {

        goToPage("https://dashboard.mailerlite.com/");
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        Assert.assertTrue(
                loginPage.enterEmailField(readProperties.getProperty("email"))
                .enterPasswordField(readProperties.getProperty("password"))
                .clickSignIn()
                .isDashboardPresent()
                );
    }

    @Test(priority = 2)
    public void validateSubscriberGroup(){
        DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
        Assert.assertTrue(dashboard.isSubscriberGroupPresent());
    }

    @Test(priority = 3)
    public void validateGroupDeletionMessage(){
        DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);

        boolean popUpHeading =
                dashboard.clickOnGroups()
                .clickOnMore()
                .clickOnDelete()
                .isPopUpHeadingPresent();

        boolean popUpMessage = dashboard.isPopUpMessagePresent();

        Assert.assertTrue(popUpHeading);
        Assert.assertTrue(popUpMessage);

    }

}
