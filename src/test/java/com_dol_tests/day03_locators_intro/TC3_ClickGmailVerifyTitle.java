package com_dol_tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ClickGmailVerifyTitle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url=("https://www.google.com");
        driver.get(url);
        driver.findElement(By.linkText("Gmail")).click();
        String expectedTitle="Gmail";
        String actualTitle= driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is successful");
        }else{
            System.out.println("Title verification is failed");
        }
        driver.navigate().back();

        driver.quit();

        String googleExpectedTitle="Google";
        String googleActualTitle= driver.getTitle();

        if (googleActualTitle.equals(googleExpectedTitle)) {

            System.out.println("Google Title verification is passed");
        }else{
            System.out.println("Google Title verification is failed");

        }
    }
}
