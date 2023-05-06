package org.example.Lecture16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseHover {
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
    public void testMouseHover() throws InterruptedException {
        Actions action =new Actions(driver);
        WebElement mouseHover= driver.findElement(By.id("mousehover"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mouseHover);

        action.moveToElement(mouseHover).perform();
        Thread.sleep(2000);

        WebElement top = driver.findElement(By.linkText("Top"));
        action.moveToElement(top).click().perform();
        Thread.sleep(2000);

    }

    @After
    public  void tearDown(){
        driver.close();
    }
}
