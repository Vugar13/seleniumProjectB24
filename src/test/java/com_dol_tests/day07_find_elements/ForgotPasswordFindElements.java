package com_dol_tests.day07_find_elements;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForgotPasswordFindElements {
    public static void main(String[] args) {

        String url="http://practice.cybertekschool.com/forgot_password";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(url);
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("count of links = "+ links.size());
        System.out.println(links.get(0).getText());
        System.out.println(links.get(1).getText());

        for(WebElement link: links){
            System.out.println(link.getAttribute("href"));

        }
        links.get(1).click();
        driver.quit();
    }
}
