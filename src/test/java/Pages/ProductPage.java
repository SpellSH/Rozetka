package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends WebSite{
    protected WebDriver driver;
    public ProductPage (WebDriver driver) {
        this.driver = driver;
    }
    public void product(){
        PriceIcon = driver.findElement(By.xpath("//p[@class='product-prices__big product-prices__big_color_red'][1]"));
        System.out.println(PriceIcon.getText());
        Assert.assertEquals(PriceIcon.getText(),"9 499₴");
    }
}
