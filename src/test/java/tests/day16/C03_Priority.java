package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMedhodAfterMethod;

public class C03_Priority extends TestBaseBeforeMedhodAfterMethod {
//testlerimizi çalıştırırken sıraya  göre calıştırmak istersek priorty kullanırız.
    //priorty kullanmazsak default olarak 0 dır.
    @Test(priority = 1)
    public void youtubeTesti() {
        driver.get("https://youtube.com");
    }

    @Test(priority = 3)
    public void bestbuyTesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test(priority = 2)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }
}
