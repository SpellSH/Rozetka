package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Televisori extends WebSite{
    protected WebDriver driver;
    public Televisori (WebDriver driver) {
        this.driver = driver;
    }
    public void SearchProduct() throws InterruptedException {
        P = driver.findElement(By.linkText("Телевизор Samsung UE43T5300AUXUA"));
        P.click();
        Thread.sleep(2000);
    }
}
