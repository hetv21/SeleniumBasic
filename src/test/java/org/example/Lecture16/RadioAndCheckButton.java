package org.example.Lecture16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.By.*;

    public class RadioAndCheckButton {
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
        public void testRadioButton() throws InterruptedException {
            driver.findElement(id("benzradio")).click();
            Thread.sleep(3000);
            boolean ans = driver.findElement(id("benzradio")).isSelected();
            assertEquals(true,ans); // Junit assertion to verify is assertEquals
            boolean ans1 = driver.findElement(id("hondaradio")).isSelected();
            assertEquals(false,ans1);
            boolean ans2 = driver.findElement(id("bmwradio")).isSelected();
            assertEquals(false,ans2);

        }

        @Test
        public  void testCheckBox(){
           driver.findElement(By.id("benzcheck")).click();
           driver.findElement(By.id("bmwcheck")).click();

           boolean ans =driver.findElement(By.id("hondacheck")).isSelected();
           assertFalse(ans);
         // boolean ans1 = driver.findElement(By.id("hondacheck")).isSelected(); //this will fail the test as we used assertTrue
         // assertTrue(ans);    // Reason honda is not selected so. (If it was assetFalse then Test will be passed)
        }
        @After
        public  void tearDown(){
            driver.close();
        }
        }



