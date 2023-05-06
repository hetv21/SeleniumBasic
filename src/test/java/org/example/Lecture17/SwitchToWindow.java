package org.example.Lecture17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchToWindow {
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
    public void switchToWindow() throws InterruptedException {
    String parenWindowHandle =driver.getWindowHandle();
        System.out.println(parenWindowHandle);
    driver.findElement(By.id("openwindow")).click();

    Set<String> allWindowHandles =driver.getWindowHandles();
        System.out.println(allWindowHandles);

        for(String handle: allWindowHandles) {
            if (!handle.equals(parenWindowHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                WebElement searchTab = driver.findElement(By.xpath("//input[@id='search']"));
                searchTab.sendKeys("Python");
                searchTab.sendKeys(Keys.ENTER);
                Thread.sleep(4000);

                driver.switchTo().window(parenWindowHandle);
                WebElement hondaRadio = driver.findElement(By.id("hondaradio"));
                hondaRadio.click();
                Thread.sleep(2000);
            }
        }
    }
    @After
    public  void tearDown(){
        driver.close();
    }}

