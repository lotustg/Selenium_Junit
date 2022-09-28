package tests.package05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMedhodAfterMethod;

public class P02 extends TestBaseBeforeMedhodAfterMethod {

    @Test
    public void test02() {

    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        // // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.xpath("//span[@id=\"button1\"]")).click();
        // // 3. Açılır metni alın
        String actualText= driver.switchTo().alert().getText();
        // // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        String expectedText="I am an alert box!";
        Assert.assertEquals(expectedText,actualText);
        // // 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();


    }
}
