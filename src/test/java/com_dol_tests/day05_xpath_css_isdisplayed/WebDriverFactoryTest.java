package com_dol_tests.day05_xpath_css_isdisplayed;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class WebDriverFactoryTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
driver.manage().window().maximize();
driver.get("https://www.etsy.com");

WebDriver driver2=WebDriverFactory.getDriver("chrome");
driver.get("https://www.google.com");

    }

}




