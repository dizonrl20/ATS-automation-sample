import org.openqa.selenium.WebDriver;

public class ClosePage {
    public static void pageClose(WebDriver driver){
        driver.quit();
        System.out.println("PASS - Browser close");
    }
}
