package org.example.PracticeHV;
    //HV working on this-Not fully completed

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

import java.util.concurrent.TimeUnit;

public class PracticeHV {

    public WebDriver driver;
    public String url = "https://demo.nopcommerce.com/";

    @Before
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);   //Implicit wait
        driver.get(url);
    }
    @Test
    public void register() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    //    Thread.sleep(2000);
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Hetal");
    //    Thread.sleep(2000);
        driver.findElement(By.id("LastName")).sendKeys("Vyas");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("hv@gmail.com");
    //    Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("hv2109");
    //    Thread.sleep(2000);
        driver.findElement(By.id("ConfirmPassword")).sendKeys("hv2109");
    //    Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[5]/button")).click();
    //    Thread.sleep(3000);
        driver.close();
    }
    @Test
        public void login() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
    //    Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("hv@gmail.com");
    //    Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("hv2109");
    //    Thread.sleep(2000);
        driver.findElement(By.id("RememberMe")).click();
    //    Thread.sleep(2000);
        driver.findElement(By.className("login-button")).click();
    //    Thread.sleep(2000);
    }
    @Test
        public void browsing() throws InterruptedException{
        Actions action =new Actions(driver);
        WebElement computer = driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", computer);
        action.moveToElement(computer).perform();
    //    Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"/notebooks\"]")).click();
    //    Thread.sleep(2000);


        //driver.findElement(By.xpath("//a[@href=\"/electronics\"]")).click();
        //Thread.sleep(2000);
        //  driver.findElement(By.xpath("//a[@href=\"/camera-photo\"]")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//a[@href=\"/apple-icam\"]")).click();

    }


    @After
        public  void tearDown() {
        driver.close();
    }}
