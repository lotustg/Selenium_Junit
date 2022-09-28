package tests.package05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMedhodAfterMethod;

import java.awt.*;

public class P01 extends TestBaseBeforeMedhodAfterMethod {
    @Test
    public void test01() {

        // ...Exercise3...
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        //fill the firstname
        //fill the lastname
        //check the gender
        //check the experience
        //fill the date
        //choose your profession -> Automation Tester
        //choose your tool -> Selenium Webdriver
        //choose your continent -> Antartica
        //choose your command  -> Browser Commands
        //click submit button
        Actions actions=new Actions(driver);
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //fill the firstname
        driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("abc");
        //fill the lastname
        driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("abc");
        //check the gender
        driver.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
        //check the experience
        driver.findElement(By.xpath("//*[@id=\"exp-0\"]")).click();
        //fill the date
        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("11.11.2011");
        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
        //choose your continent -> Antartica
       WebElement ddmContinent= driver.findElement(By.xpath("//*[@id=\"continents\"]"));
        Select select= new Select(ddmContinent);
        select.selectByVisibleText("Antartica");
        // driver.findElement(By.xpath("//*[@id=\"continents\"]")).sendKeys("Antartica)

        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();

        //click submit button
driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();








    }
}
