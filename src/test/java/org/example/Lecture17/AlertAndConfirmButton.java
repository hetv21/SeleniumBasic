package org.example.Lecture17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertAndConfirmButton {public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); //implicit wait
        driver.get(url);
    }
    @Test
    public void testAlertButton() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("HV");
        driver.findElement(By.id("alertbtn")).click();
      //  Thread.sleep(2000);  //used this for me to see how it works
        driver.switchTo().alert().accept();

    }
    @Test
    public void testConfirmButton() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("HV");
        driver.findElement(By.id("confirmbtn")).click();
      //  Thread.sleep(2000);  //used this for me to see how it works
        driver.switchTo().alert().dismiss();
    }

    @After
    public  void tearDown(){
        driver.close();
    }}

