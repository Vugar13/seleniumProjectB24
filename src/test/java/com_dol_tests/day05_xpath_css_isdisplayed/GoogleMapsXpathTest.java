package com_dol_tests.day05_xpath_css_isdisplayed;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMapsXpathTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url="https://www.google.com/maps";
        driver.get(url);

         WebElement addressField= driver.findElement(By.xpath("/html/body/div[3]/div[9]" +
                 "/div[3]/div[1]/div[1]/div[1]/div[2]/form/div[2]/div[3]/div/input[1]"));
         addressField.sendKeys("cybertek school" + Keys.ENTER);

         Thread.sleep(3000);

         WebElement directions= driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[9]/div/" +
                 "div/div[1]/div[2]/div/div[1]/div/div/div[2]/div[1]/div" +
                 "[3]/div/div[2]/div[2]/div[2]/div[2]/button/span"));

         directions.click();

         Thread.sleep(3000);
         WebElement startingPoint=driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']"));
         startingPoint.sendKeys("4238 Wilson Blvd, Arlington, VA 22203"+Keys.ENTER);

    }
}
