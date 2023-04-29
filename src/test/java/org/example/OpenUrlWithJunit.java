    package org.example;

    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.junit.Test;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class OpenUrlWithJunit {// no main method required
        @Test
        public void openNopcommerce(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            driver.close();
        }

        @Test
        public void openArgos(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://www.argos.co.uk/");
            driver.close();
        }

        @Test
        public void openAmazon(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://www.amazon.co.uk/");
            driver.close();
    }}
