package org.example.Lecture17;
// Not completed- HV working on this

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchTab {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
        public void switchTab() throws InterruptedException {
     //  String parenWindowHandle =driver.getWindowHandle();
       //System.out.println(parenWindowHandle);
        driver.findElement(By.id("opentab")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href=\"/home\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//label[@for=\"bmw\"]")).click();
        //Thread.sleep(2000);


    }
    @After
    public  void tearDown(){
        driver.close();
    }}
/*WebElement searchTab = driver.findElement(By.xpath("//input[@id='search']"));
        searchTab.sendKeys("Python");
        searchTab.sendKeys(Keys.ENTER);
        Thread.sleep(4000); */