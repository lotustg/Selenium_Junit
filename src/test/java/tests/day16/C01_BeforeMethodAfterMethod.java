package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMedhodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMedhodAfterMethod {
    @Test
    public void amazonTesti() {
        driver.get("https://amazon.com");
    }

    @Test
    public void bestBuyTesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproeducationTesti() {
        driver.get("https://www.techproeducation.com");
    }
}
