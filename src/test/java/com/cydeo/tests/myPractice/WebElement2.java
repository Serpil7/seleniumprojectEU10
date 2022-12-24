package com.cydeo.tests.myPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https:www.facebook.com");

       driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
      WebElement eposta= driver.findElement(By.xpath("//input[@id='email']"));

      eposta.sendKeys("ssfz");
      WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
      pass.sendKeys("ssffz");

      driver.findElement(By.xpath("//button[@name='login']")).click();
      WebElement resultElement=driver.findElement(By.xpath("//div[@class='_9ay7']"));
      String expectedResult = "The email or mobile number you entered isn't connected to an account.";
      String actualResult = resultElement.getText();
      if(expectedResult.equals(actualResult)){
          System.out.println("PASSED!");
      }else{
          System.out.println("FAILED!");
      }
      driver.close();

    }
}
