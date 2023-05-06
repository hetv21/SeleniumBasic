package org.example.Lecture15;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
        @Test
        public void openNopcommerce() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            Thread.sleep(2000);
            driver.findElement(By.className("ico-register")).click();
            driver.findElement(By.id("FirstName")).sendKeys("Hetal");
            Thread.sleep(2000);
            driver.findElement(By.id("LastName")).sendKeys("Vyas");
            driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("hv@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.id("Password")).sendKeys("hv2109");
            Thread.sleep(2000);
            driver.findElement(By.id("ConfirmPassword")).sendKeys("hv2109");
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[5]/button")).click();
            Thread.sleep(3000);
            driver.close();
        }
    }
