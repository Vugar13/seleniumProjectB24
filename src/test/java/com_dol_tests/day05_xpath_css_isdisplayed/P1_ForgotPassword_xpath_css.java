package com_dol_tests.day05_xpath_css_isdisplayed;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_ForgotPassword_xpath_css {
    public static void main(String[] args) {


        String appUrl="http://practice.cybertekschool.com/forgot_password";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(appUrl);

        WebElement homeLink= driver.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement forgotPassword= driver.findElement(By.xpath("//form[@action='/forgot_password']"));
        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email'"));
        WebElement emailField= driver.findElement(By.xpath("//input[@name='email']"));
        WebElement retrievePasswordBtn= driver.findElement(By.xpath("//i[.='Retrieve password']"));
        WebElement poweredByLabel= driver.findElement(By.xpath("//div[@style='text-align: center;']"));




    }
}
