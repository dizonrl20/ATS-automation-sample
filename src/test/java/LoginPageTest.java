import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;


public class LoginPageTest {

    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BETSY\\Downloads\\cd\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://spec.atsspecsolutions.com/");
        LoginPage loginPage = new LoginPage();
        loginPage.loginForm(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement check = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//h6[text()='Start New Project']")));
        String checkText = check.getText();
        assertEquals("Start New Project", checkText);
    }




    }