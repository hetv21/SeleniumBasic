package org.example.Lecture16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAndSelect {
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
        public void testDropdown() throws InterruptedException {
        WebElement dropDown =driver.findElement(By.id("carselect"));
        Select select =new Select(dropDown); //Select class from Selenium

        select.selectByVisibleText("Honda"); //can be selected by visible text
        Thread.sleep(2000);

        select.selectByIndex(0); //can be selected by index
        Thread.sleep(2000);

        select.selectByValue("benz");  //can be selected by value
        Thread.sleep(2000);
    }

    @Test
    public void multipleSelect()throws InterruptedException{
        WebElement multipleSelect =driver.findElement((By.id("multiple-select-example")));
        Select select =new Select(multipleSelect);

        select.selectByVisibleText("Apple");
        Thread.sleep(2000);

        select.selectByIndex(1);
        Thread.sleep(2000);

        select.selectByValue("peach");
        Thread.sleep(2000);
    }

    @After
    public  void tearDown(){
        driver.close();
    }}