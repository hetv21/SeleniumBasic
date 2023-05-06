    package org.example.Lecture15;

    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.junit.After;
    import org.junit.Before;
    import org.junit.Test;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class OpenUrlMethods { //for easy readability, to make test case independent and to avoid duplication
        //2 methods-set up method and tear down method (close)
        public WebDriver driver;

        @Before
        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @Test
        public void openNopcommerce() {
            driver.get("https://demo.nopcommerce.com/");
        }

        @Test
        public void openArgos() {

            driver.get("https://www.argos.co.uk/");
        }

        @Test
        public void openAmazon() {

            driver.get("https://www.amazon.co.uk/");
        }

        @Test
        public void openNext() {

            driver.get("https://www.next.co.uk/");
        }

        @Test
        public void openDebenhams() {

            driver.get("https://www.debenhams.com/");
        }

        @After
        public void tearDown() {
            driver.close();
        }
    }
