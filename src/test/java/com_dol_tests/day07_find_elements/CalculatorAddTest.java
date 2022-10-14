package com_dol_tests.day07_find_elements;

import com_dol_tests.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorAddTest {
    public static void main (String[] args) throws InterruptedException {

        String appUrl="https://www.calculator.net";
        int num1=5,num2=3, expectedResult=8;

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(appUrl);

        WebElement num1Elem=driver.findElement(By.xpath("//span[@onclick='r(5)']"));
        WebElement AddElem= driver.findElement(By.xpath("//span[.='+']"));
        WebElement num2Elem= driver.findElement(By.xpath("//span[@onclick='r(3)']"));
        WebElement equalElem= driver.findElement(By.xpath("//span[text()='=']"));
        num1Elem.click();
        Thread.sleep(2000);
        AddElem.click();
        Thread.sleep(2000);
        num2Elem.click();
        Thread.sleep(2000);
        equalElem.click();
WebElement result= driver.findElement(By.cssSelector("div[id='sciOutPut']"));
        System.out.println(num1 +"+"+num2+"="+result.getText());
        String resultValue= result.getText();
        resultValue=resultValue.trim();

        int actualResult=Integer.parseInt(resultValue);

        if (actualResult==expectedResult){
            System.out.println("Pass: calculation match");
        }else{
            System.out.println("Fail: calculation mismatch");
        }

driver.quit();

    }
}
