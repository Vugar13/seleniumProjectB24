package com_dol_tests.day09_testng_dropdowns;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Smart_bear_weborder {
    public static void main(String[] args) {
        String url="http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(url);
        WebElement userName= driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));
        userName.sendKeys("Tester");
        password.sendKeys("test");
        WebElement loginBtn= driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginBtn.click();
        WebElement orderLinks= driver.findElement(By.xpath("//a[.='Order']"));
        orderLinks.click();
    }
}
