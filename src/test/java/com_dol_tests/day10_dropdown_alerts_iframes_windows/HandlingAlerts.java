package com_dol_tests.day10_dropdown_alerts_iframes_windows;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com_dol_tests.utils.WebDriverFactory.getDriver;

public class HandlingAlerts {

    String url = "http://practice.cybertekschool.com/dropdown";
    WebDriver driver;//can use in every method

    @BeforeMethod
    public void setUp() {
        driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }


}