package com_dol_tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_SmartBearLoginTest {

    public static void main(String[] args) throws InterruptedException {
        String appUrl="http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
String userName="Tester";
String psw="test";

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(appUrl);

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(psw);
driver.findElement(By.id("ctl00_MainContent_login_button")).click();

String expectedTitles="Web Orders";
String actTitles=driver.getTitle();

if (actTitles.equals(expectedTitles)){
    System.out.println("Test Passed");
}else {
    System.out.println("Test Failed");

}
if (driver.getTitle().equals("Web Orders"))
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
    }
}
