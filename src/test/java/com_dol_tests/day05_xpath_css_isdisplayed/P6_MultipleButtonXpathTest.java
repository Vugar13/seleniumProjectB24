package com_dol_tests.day05_xpath_css_isdisplayed;

import com_dol_tests.utils.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_MultipleButtonXpathTest {
    public static void main(String[] args) {

        String url="http://practice.cybertekschool.com/multiple_buttons";
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(url);

        WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        WebElement resultMessage= driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(resultMessage.getText());

        WebElement button2= driver.findElement(By.xpath("//button[text()='Button 2']"));
        if (button2.isDisplayed()){
            button2.click();
        }else{
            System.out.println("Fail: Button2 is not displayed");
        }
        driver.quit();
    }
}
