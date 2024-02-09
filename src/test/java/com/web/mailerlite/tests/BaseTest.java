package com.web.mailerlite.tests;

import com.web.mailerlite.infra.BaseClass;
import com.web.mailerlite.utils.readProperties;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest extends BaseClass {

    @BeforeClass
    public void setup(){
        setupDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(readProperties.shortWait));
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
