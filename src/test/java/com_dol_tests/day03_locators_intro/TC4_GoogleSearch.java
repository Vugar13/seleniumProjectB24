package com_dol_tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class TC4_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        String url ="https://www.google.com";
        driver.get(url);

driver.findElement(By.name("q")).sendKeys("apple"+Keys.ENTER);
//Thread.sleep(2000);
//driver.findElement(By.name("btnK")).click();

String appleExpectedTitle="apple";
String appleActualTitle= driver.getTitle();

if (appleActualTitle.startsWith(appleExpectedTitle)){
    System.out.println("Pass: Title match");
}else{
    System.out.println("Failed: Title mismatched");
}
driver.quit();

    }
}
