package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MainPage extends WebSite {
        protected WebDriver driver;
        public MainPage (WebDriver driver) {
            this.driver = driver;
        }
    public void MainPageSearch() throws InterruptedException {
        SearchField = driver.findElement(By.xpath("//input[@name='search']"));
        SearchField.click();
        product ="Телевизор";
        SearchField.sendKeys(product);
        SearchField.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }
}
