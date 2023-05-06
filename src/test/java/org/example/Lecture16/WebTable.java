package org.example.Lecture16;  //still working on this-not completed yet

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {
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
    public void testWebTable() throws InterruptedException {

       /* int columnCount = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/th[1]")).size();
        int rowCount =driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr[1]")).size();
        System.out.println(columnCount);
        System.out.println(rowCount);
        Thread.sleep(2000); */

        List<WebElement> allHeaders = driver.findElements(By.id("product"));
        System.out.println(allHeaders.size());
        Thread.sleep(2000);
        for (WebElement element : allHeaders) {
            String value = element.getText();
            System.out.println(value);
        }
    }
    @After
    public  void tearDown(){
        driver.close();
    }
}
