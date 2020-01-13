import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PageChecker {
    public static void waitForCheck(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement check = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//h4[text()='Select Fixture Category']")));
        String checkText = check.getText();
        assertEquals("Select Fixture Category", checkText);
        System.out.println("PASS - End of test");

    }
}
