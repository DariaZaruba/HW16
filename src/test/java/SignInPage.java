import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SignInPage {

    public WebDriver driver;
    public String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account.php";

    @BeforeSuite
    public void setUpForSignIn() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("The setup process is completed");
    }

    @BeforeTest
    public void doBeforeSignTest() {
        driver.manage().window().maximize();
        System.out.println("The profile setup process is completed");
    }

    @BeforeClass
    public void appSetup() {
        driver.get(url);
        System.out.println("The app setup process is completed");
    }

    @BeforeMethod
    public void CheckSign() {
        driver.get(url);
    }

    @AfterTest
    public void afterTest() {
        driver.close();
    }

    @DataProvider (name ="data-provider")
    public Object[][] dataproviderMethod() {
        Object[][] loginProperty = new Object[][] {
                {"test.com", "password"},
//                {"test.com2", "password2"}
        };
        return loginProperty;
    }

    @Test (dataProvider = "data-provider")
    public void alreadyRegistered(String eAddress, String ePassword) {

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();

        driver.findElement(By.cssSelector("#email")).sendKeys(eAddress);
        driver.findElement(By.cssSelector("#passwd")).sendKeys(ePassword);

        if (driver.findElement(By.cssSelector(".navigation_page")).getText() != null) {
            System.out.println("Email " + name + " is Filled");
        } else {
            System.out.println("Email is NOT Filled");
        }

    }



    @Test
    public void autentificationTab() {


//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account.php");

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        if (driver.findElement(By.cssSelector(".navigation_page")) != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
//        driver.close();
    }

    @Test
    public void emaiAddressField() {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account.php");

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        if (driver.findElement(By.cssSelector("#email_create")) != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
//        driver. close();
    }

    @Test
    public void submitCreationButton() {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account.php");

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        if (driver.findElement(By.cssSelector("#SubmitCreate")) != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
//        driver. close();
    }
    @Test
    public void submitLoginButton() {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account.php");

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        if (driver.findElement(By.cssSelector("#SubmitLogin")) != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
//        driver. close();
    }

    }

