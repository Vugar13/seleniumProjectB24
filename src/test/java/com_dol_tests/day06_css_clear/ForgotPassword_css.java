package com_dol_tests.day06_css_clear;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword_css {
    public static void main(String[] args) throws InterruptedException {

        String url="http://practice.cybertekschool.com/forgot_password";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(url);
        WebElement emailField= driver.findElement(By.cssSelector("input[name='email']"));
        emailField.sendKeys("student@gmail.com");
        emailField.clear();

        Thread.sleep(3000);

        emailField.sendKeys("student2@gmail.com");

        for(int i=2;i<10;i++){
            Thread.sleep(3000);

            emailField.clear();
            emailField.sendKeys("student"+i+"@gmail.com");
        }

    }
}
