package com_dol_tests.day07_find_elements;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC3_AddRemoveElements {
    public static void main(String[] args) {

        String appUrl = "http://practice.cybertekschool.com/add_remove_elements/";
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(appUrl);
        WebElement addElement = driver.findElement(By.xpath("//button[.='Add Element']"));
        for (int i = 0; i < 50; i++) {
            addElement.click();
        }
        List<WebElement> deleteBtns = driver.findElements(By.xpath("//button[.='Delete']"));
        System.out.println("count of delete buttons" + deleteBtns.size());
        if (deleteBtns.size() == 50) {
            System.out.println("Test passed");

        } else {
            System.out.println("Test Failed");
            for (WebElement deleteButton : deleteBtns) {
                deleteButton.click();
            }
            deleteBtns = driver.findElements(By.xpath("//button[text()='Delete']"));
            if (deleteBtns.isEmpty()) {
                System.out.println("Pass: All 50 btn deleted successfully");
            } else {
                System.out.println("Failed");
            }


            //deleteBtn.forEach(delete-> delete.click());
            //System.out.println(deleteBtn);


        }


    }
}






