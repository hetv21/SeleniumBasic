    package org.example.Lecture15;

    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.junit.Test;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class OpenUrlWithJunit {// Junit beneft-no main method required. can run test case independently
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
