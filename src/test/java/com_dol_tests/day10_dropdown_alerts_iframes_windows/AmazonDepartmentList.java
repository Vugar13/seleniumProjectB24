package com_dol_tests.day10_dropdown_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com_dol_tests.utils.WebDriverFactory.*;
import static org.testng.Assert.*;

public class AmazonDepartmentList {
    String amazonUrl="https://www.amazon.com/";
    WebDriver driver;



    @BeforeMethod
    public void setUp(){
        driver=getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(amazonUrl);

    }
    @Test
    public void amazonDepartmentTest() throws InterruptedException {
        String expTitle="Amazon.com. Spend less. Smile more.";
        assertEquals(driver.getTitle(),expTitle);

        //assert that
        Select departments=new Select(driver.findElement(By.id("searchDropdownBox")));
        String selectedOption=departments.getFirstSelectedOption().getText();
        assertEquals(selectedOption,"All Departments");

        List<WebElement> allDepartments=departments.getOptions();
        int countOfDepartments=allDepartments.size();
        System.out.println("countOfDepartments = " + countOfDepartments);
        assertTrue(countOfDepartments>10,"Department names are missing");

       for(WebElement dept : allDepartments){
           System.out.println(dept.getText());

}
        System.out.println("Using FOREACH METHOD + LAMBDA EXPRESSION");
       allDepartments.forEach(dept -> System.out.println(dept.getText()));

       for (WebElement dept:allDepartments){
           departments.selectByVisibleText(dept.getText());

       }

        }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test(enabled=false)//skip this test
    public void testDemo(){
        System.out.println("testDemo is running");
    }
}
