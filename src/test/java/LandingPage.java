import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class LandingPage {

    public WebDriver driver;
    public String url = "http://automationpractice.com/index.php";

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("The setup process is completed");
    }

    @BeforeTest
    public void doBeforeTest() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        System.out.println("The profile setup process is completed");
    }

    @BeforeClass
    public void appSetup() {
        driver.get(url);
        System.out.println("The app setup process is completed");
    }

    @BeforeMethod
    public void checkLanding() {
        driver.get(url);
    }

    @AfterTest
    public void doAfterTest() {
        driver.close();
    }

    @Test
    public void signInButton() {

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        if (driver.findElement(By.cssSelector(".header_user_info a")) != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
    }

    @Test
    public void Banner() {

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        WebElement banner = driver.findElement(By.cssSelector(".banner img"));
        if (banner != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
    }

    @Test
    public void contactUs() {

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        WebElement banner = driver.findElement(By.cssSelector("#contact-link"));
        if (banner != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
    }

    @Test
    public void searchButton() {

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        WebElement banner = driver.findElement(By.cssSelector("#search_block_top button"));
        if (banner != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
    }

}


