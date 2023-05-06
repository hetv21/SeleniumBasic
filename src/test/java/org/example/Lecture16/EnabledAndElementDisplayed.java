package org.example.Lecture16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EnabledAndElementDisplayed {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
}

    @Test
    public void checkEnabledButton() throws InterruptedException {
        driver.findElement(By.id("enabled-button")).click();
        boolean ans= driver.findElement(By.id("enabled-button")).isEnabled();
        assertTrue(ans);
        driver.findElement(By.id("enabled-example-input")).sendKeys("Test Passed:)");
        Thread.sleep(2000);
    }

    @Test
    public void checkDisabled(){
        driver.findElement(By.id("disabled-button")).click();
        boolean ans1= driver.findElement(By.id("enabled-example-input")).isEnabled();
        assertFalse(ans1);
    }

    @Test
    public void testElementDisplayHidden() throws InterruptedException {
        driver.findElement(By.id("hide-textbox")).click();
        Thread.sleep(3000);
        boolean ans = driver.findElement(By.id("displayed-text")).isDisplayed();
        assertFalse(ans);
    }

        @Test
        public void testElementDisplayedShown() throws InterruptedException {
        driver.findElement(By.id("show-textbox")).click();
        Thread.sleep(2000);
        boolean ans1 = driver.findElement(By.id("displayed-text")).isDisplayed();
        assertTrue(ans1);
        driver.findElement(By.id("displayed-text")).sendKeys("It is visible");
        Thread.sleep(2000);
    }
    @After
    public  void tearDown(){
        driver.close();
    }}