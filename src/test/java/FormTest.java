import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static sun.misc.Version.println;

//import static org.junit.Assert.assertEquals;

public class FormTest {
    @BeforeAll
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BETSY\\Downloads\\cd\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://spec.atsspecsolutions.com/");

        LoginPage loginPage = new LoginPage();
        loginPage.loginForm(driver);

        DetailPage detailPage = new DetailPage();
        detailPage.stepOne(driver);
        detailPage.stepTwo(driver);
        detailPage.stepThree(driver);

        PageChecker pageChecker = new PageChecker();
        pageChecker.waitForCheck(driver);

        ClosePage closePage = new ClosePage();
        closePage.pageClose(driver);

    }





}
