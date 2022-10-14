package com_dol_tests.day08_implicitwait_checkbox_radio_testing;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBoxesWithImplicitWait {
    public static void main(String[] args) {
        String url="http://practice.cybertekschool.com/checkboxes";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        WebElement checkbox1= driver.findElement(By.name("checkbox1"));
        checkbox1.click();
        WebElement unCheckbox2= driver.findElement(By.xpath("//input[@id='box2']"));
        unCheckbox2.click();
    }
}
