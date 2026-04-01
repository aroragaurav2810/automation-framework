package com.demo.automation.tests;

import com.demo.automation.base.DriverFactory;
import com.demo.automation.pages.GooglePage;
import com.demo.automation.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void verifyTitle() {
        WebDriver driver = DriverFactory.getDriver();

        GooglePage googlePage = new GooglePage(driver);

        String url = ConfigReader.get("baseUrl");
        googlePage.open(url);

        Assert.assertTrue(googlePage.getTitle().contains("Google"));
    }
}
