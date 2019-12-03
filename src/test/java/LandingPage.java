
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.UUID;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.util.zip.ZipFile;

public class LandingPage {

    public WebDriver driver;

    @BeforeTest
    public void doBeforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @AfterTest
    public void doAfterTest() {
        driver.close();
    }

    @Test
    public void signInButton() {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("http://automationpractice.com/index.php");
//
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        if (driver.findElement(By.cssSelector(".header_user_info a")) != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
//        driver.close();
    }

    @Test
    public void Banner() {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("http://automationpractice.com/index.php");

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        WebElement banner = driver.findElement(By.cssSelector(".banner img"));
        if (banner != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
//        driver.close();
    }

    @Test
    public void contactUs() {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("http://automationpractice.com/index.php");

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        WebElement banner = driver.findElement(By.cssSelector("#contact-link"));
        if (banner != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
//        driver.close();
    }

    @Test
    public void searchButton() {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("http://automationpractice.com/index.php");

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        WebElement banner = driver.findElement(By.cssSelector("#search_block_top button"));
        if (banner != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
//        driver.close();
    }
}


