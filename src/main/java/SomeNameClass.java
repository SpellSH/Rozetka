import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SomeNameClass {

    private WebDriver driver;

    @BeforeClass
    public void beforeClassMethod (){

    }
    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\Beketov\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/?gclid=Cj0KCQiAoab_BRCxARIsANMx4S78s3o2FpqUDbukBLFrU42rvSr3IibGTMFJJ8t-svPejA-DScTRrqkaAhUxEALw_wcB");
    }
    @Test
    public void method1 (){
        //Assert.assertTrue();
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
    public void afterClassMethod (){

    }
}
