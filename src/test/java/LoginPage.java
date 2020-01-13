import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPage {
    public static void loginForm(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("dovini5510@one-mail.top");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Ats123456");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement check = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//h6[text()='Start New Project']")));
        String checkText = check.getText();
        assertEquals("Start New Project", checkText);
        System.out.println("PASS - User Login");
    }
}
