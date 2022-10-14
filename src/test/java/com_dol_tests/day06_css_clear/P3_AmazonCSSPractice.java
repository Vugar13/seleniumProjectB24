package com_dol_tests.day06_css_clear;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_AmazonCSSPractice {
    public static void main(String[] args) throws InterruptedException {
        String appUrl="https://www.amazon.com/";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(appUrl);
        WebElement searchField= driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        WebElement searchBtn= driver.findElement(By.cssSelector("input[value='Go']"));
        searchField.sendKeys("wooden spoon");
        searchBtn.click();

        searchField.clear();
    }
}
