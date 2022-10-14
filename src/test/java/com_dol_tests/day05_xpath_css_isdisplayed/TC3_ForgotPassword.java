package com_dol_tests.day05_xpath_css_isdisplayed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ForgotPassword {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
String url="http://practice.cybertekschool.com/forgot_password";
driver.get(url);

WebElement forgotPsw=driver.findElement(By.linkText("Forgot Password"));

        System.out.println("forgotPsw = " + forgotPsw);



    }
}
