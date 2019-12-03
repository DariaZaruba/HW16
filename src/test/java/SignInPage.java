import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignInPage {

    @Test
    public void autentificationTab() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account.php");

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        if (driver.findElement(By.cssSelector(".navigation_page")) != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
        driver.close();
    }

    @Test
    public void emaiAddressField() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account.php");

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        if (driver.findElement(By.cssSelector("#email_create")) != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
        driver. close();
    }

    @Test
    public void submitCreationButton() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account.php");

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        if (driver.findElement(By.cssSelector("#SubmitCreate")) != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
        driver. close();
    }
    @Test
    public void submitLoginButton() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spdguest\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account.php");

        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        if (driver.findElement(By.cssSelector("#SubmitLogin")) != null) {
            System.out.println("Element " + name + " is Present");
        } else {
            System.out.println("Element is Absent");
        }
        driver. close();
    }

    }

