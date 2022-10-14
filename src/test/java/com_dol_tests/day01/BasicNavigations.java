package com_dol_tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.tesla.com");
        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().refresh();

        Thread.sleep(2000);

        driver.navigate().forward();

        driver.navigate().to("https://www.bestbuy.com");

        System.out.println("Current title" + driver.getCurrentUrl());

        driver.quit();
    }
}
