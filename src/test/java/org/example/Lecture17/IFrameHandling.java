package org.example.Lecture17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class IFrameHandling {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public void iFramePractice() throws InterruptedException {
        WebElement iframe = driver.findElement(By.id("courses-iframe"));
    //    Thread.sleep(2000);
        driver.switchTo().frame(iframe); //switched to iframe

       WebElement searchTab = driver.findElement(By.xpath("//input[@id='search']"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchTab);
    //  Thread.sleep(4000);
       searchTab.sendKeys("Python"); //type python in search bar
       searchTab.sendKeys(Keys.ENTER);
    //  Thread.sleep(2000);
    }

    @Test
    public void iFramePractice1() throws InterruptedException {
        WebElement iframe = driver.findElement(By.id("courses-iframe"));
    //    Thread.sleep(2000);
        driver.switchTo().frame(0);

        WebElement searchTab = driver.findElement(By.xpath("//input[@id='search']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchTab);
    //    Thread.sleep(4000);
        searchTab.sendKeys("Selenium"); //type selenium in search bar
        searchTab.sendKeys(Keys.ENTER);
    //    Thread.sleep(2000);

        driver.switchTo().defaultContent();// to switch back to main screen
        driver.findElement(By.id("bmwcheck")).click(); // click on bmw checkbox on main screen
    //    Thread.sleep(2000);

        // WebElement bmwCheckbox = driver.findElement(By.xpath("//label[@for=\"bmw\"]"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bmwCheckbox);
        //Thread.sleep(2000);

    }
    @After
    public  void tearDown(){
        driver.close();
    }}

// driver.findElement(By.xpath("//div[@id=\"navbar-inverse-collapse\"]/ul/li[3]"));
//  Thread.sleep(2000);