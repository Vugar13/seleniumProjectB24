package com_dol_tests.day10_dropdown_alerts_iframes_windows;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CarGurusUsedCarSearchTest {

    String url="https://www.cargurus.com";
    WebDriver driver;


    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);

    }

    @AfterClass
    public void tearDown(){
      driver.quit();
    }

    @Test
    public void searchForMinivan(){
        String expTitle="Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(driver.getTitle(),expTitle);
        WebElement buyUsedCar= driver.findElement(By.xpath("//label[@class='ft-homepage-search__tabs__used-car ']"));
        buyUsedCar.click();
        WebElement makeOfCar=driver.findElement(By.id("carPickerUsed_makerSelect"));
        Select make=new Select(makeOfCar);
        make.selectByValue("m7");

        Select model=new Select(driver.findElement(By.id("carPickerUsed_modelSelect")));
        model.selectByValue("d308");

        WebElement zipcode= driver.findElement(By.id("dealFinderZipUsedId_dealFinderForm"));
        zipcode.sendKeys("22033");

        //print currently selected options of make and model
        System.out.println("Selected make = "+make.getFirstSelectedOption().getText());
        System.out.println("Selected model = "+model.getFirstSelectedOption().getText());

        WebElement searchBtn= driver.findElement(By.id("dealFinderForm_0"));
        searchBtn.click();

        WebElement resultCount= driver.findElement(By.xpath("(//span[@class='eegHEr']/strong)[2]"));
        System.out.println("Result Count = " +resultCount.getText());

        //assert that count is more than 0
        int count=Integer.parseInt(resultCount.getText());
        Assert.assertTrue(count>0);
       // driver.quit();
    }

}
