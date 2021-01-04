import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SomeClass {
    
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebElement SearchField;
        WebElement SearchButton;
        WebElement PriceIcon;
        String product;
        String price;
        WebElement P;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/?gclid=Cj0KCQiAoab_BRCxARIsANMx4S78s3o2FpqUDbukBLFrU42rvSr3IibGTMFJJ8t-svPejA-DScTRrqkaAhUxEALw_wcB");
        SearchField = driver.findElement(By.xpath("/html/body//form/div/div/input"));
        SearchField.click();
        product ="Телевизор";
        SearchField.sendKeys(product);
        SearchField.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        P = driver.findElement(By.linkText("Телевизор Samsung UE43T5300AUXUA"));
        P.click();
    }

        }  



