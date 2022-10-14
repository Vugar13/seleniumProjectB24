package com_dol_tests.day05_xpath_css_isdisplayed;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Worldometers_Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url="https://www.worldometers.info/world-population/";
        driver.get(url);

        Thread.sleep(3000);
        WebElement populationNumber= driver.findElement(By.xpath("//div[@class='maincounter-number']"));
        System.out.println(populationNumber.getText());


        for (int i = 1; i <=10 ; i++) {
            Thread.sleep(1000);
            System.out.println(i + "-" + populationNumber.getText());

        }
        driver.quit();

        }
    }

