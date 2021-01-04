import Pages.MainPage;
import Pages.ProductPage;
import Pages.Televisori;
import Pages.WebSite;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClassTest {
   /* WebElement SearchField;
    WebElement SearchButton;
    WebElement PriceIcon;
    String product;
    String price;
    WebElement P;*/
    WebDriver driver;

    @BeforeClass
    public static void beforeClassMethod (){

    }
    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\Beketov\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/?gclid=Cj0KCQiAoab_BRCxARIsANMx4S78s3o2FpqUDbukBLFrU42rvSr3IibGTMFJJ8t-svPejA-DScTRrqkaAhUxEALw_wcB");
    }
    @Test
    public void method1 () throws InterruptedException {
        /*SearchField = driver.findElement(By.xpath("//input[@name='search']"));
        SearchField.click();
        product ="Телевизор";
        SearchField.sendKeys(product);
        SearchField.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        P = driver.findElement(By.linkText("Телевизор Samsung UE43T5300AUXUA"));
        P.click();
        Thread.sleep(1000);
        PriceIcon = driver.findElement(By.xpath("//p[@class='product-prices__big product-prices__big_color_red'][1]"));
        System.out.println(PriceIcon.getText());
        Assert.assertEquals(PriceIcon.getText(),"9 499₴");*/
        MainPage mp = new MainPage(driver);
        mp.MainPageSearch();
        Televisori t = new Televisori(driver);
        t.SearchProduct();
        ProductPage pp = new ProductPage(driver);
        pp.product();
    }
    @Test
    public void method2 (){

    }
    @Test
    public void method3 (){

    }
    @After
    public void tearDown (){
        driver.quit();
    }
    @AfterClass
    public static void afterClassMethod (){

    }
}
