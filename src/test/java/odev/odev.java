package odev;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMedhodAfterMethod;

public class odev extends TestBaseBeforeMedhodAfterMethod {

    /*
    1) Bir class oluşturun: YoutubeAssertions
2) https://www.youtube.com adresine gidin
3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
     */

    @Test
    public void testYoutube() {
        driver.get("https://youtube.com");

    }
}
