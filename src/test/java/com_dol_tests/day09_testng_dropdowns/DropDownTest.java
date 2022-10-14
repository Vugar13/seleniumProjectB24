package com_dol_tests.day09_testng_dropdowns;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownTest {

    String url="http://practice.cybertekschool.com/dropdown";
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test
    public void titleTest(){
        System.out.println("Title of the page= " +driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Dropdowns");

    }
    @Test
    public void simpleDropDownTest(){
        WebElement dropdown= driver.findElement(By.id("dropdown"));
        Select simpleDropDown=new Select(dropdown);
        simpleDropDown.selectByVisibleText("Option 1");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Closing browser");
        //driver.quit();
    }
}
