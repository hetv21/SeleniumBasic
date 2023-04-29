package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice2 {
    @Test
    public void openAmazonUk() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.co.uk/");
        driver.findElements(By.xpath("//script[@src=\"https://images-eu.ssl-images-amazon.com/images/I/31bJewCvY-L.js\"]"));
        Thread.sleep(2000);
        driver.findElement(By.id("sp-cc-accept")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@aria-label='Search Amazon.co.uk']")).sendKeys("original apple watch charger");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]")).click();
        Thread.sleep(1222);
        driver.close();

        //  driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();


    }
}