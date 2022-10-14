package com_dol_tests.day10_dropdown_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com_dol_tests.utils.WebDriverFactory.getDriver;

public class MultiSelectDropDown {

    String url="http://practice.cybertekschool.com/dropdown";
    WebDriver driver;//can use in every method

    @BeforeMethod
    public void setUp(){
        driver=getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }
   @Test
    public void selectMultipleLanguagesTest() throws InterruptedException {
        Select language=new Select(driver.findElement(By.name("Languages")));
        language.selectByVisibleText("Java");
        language.selectByVisibleText("JavaScript");
       language.selectByVisibleText("Python");
       System.out.println("language.isMultiple() = " + language.isMultiple());
       Thread.sleep(1234);
       language.deselectAll();



Thread.sleep(1234);
for (WebElement each : language.getOptions()){
    each.click();
}
   }
}
