package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeMedhodAfterMethod {

        protected WebDriver driver;
        Actions actions;
protected String tarih;

//TestNG Frameworkunda @Before ve @After notasyonları yerine @BeforeMethod ve @AfterMethod lullanılır
    //JUnit calisma prensibi JUnit deki Before, After ile aynıdır.
        @BeforeMethod
        public void setup(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
         //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            actions =new Actions(driver);

            LocalDateTime date= LocalDateTime.now();
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYMMddHHmmss");
            tarih= date.format(formatter);
        }
        @AfterMethod
        public void tearDown(){
            //driver.close();
                  }

    }

