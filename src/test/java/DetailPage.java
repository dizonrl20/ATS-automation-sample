import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DetailPage {
    public static void stepOne(WebDriver driver){
        driver.findElement(By.cssSelector("a[href*='NewProject']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("input[name='internalNo']")).sendKeys("Ats123456");
        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Ats123456");
        driver.findElement(By.cssSelector("input[name='location.country.id']")).sendKeys("Canada");
        driver.findElement(By.cssSelector("div#react-autowhatever-1 li:nth-child(1)")).click();
        driver.findElement(By.cssSelector("input[name='location.province.id']")).click();
        driver.findElement(By.cssSelector("div#react-autowhatever-1 li:nth-child(9)")).click();
        driver.findElement(By.cssSelector("input[name='location.city.id']")).click();

        driver.findElement(By.cssSelector("input[name='location.city.id']")).sendKeys("  ");
        driver.findElement(By.xpath(".//p[text()='Required']")).click();
        driver.findElement(By.cssSelector("input[name='location.city.id']")).sendKeys("Toronto");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //needed
        driver.findElement(By.cssSelector("div#react-autowhatever-1 li:nth-child(1)")).isDisplayed();
        driver.findElement(By.cssSelector("div#react-autowhatever-1 li:nth-child(1)")).click();
        driver.findElement(By.cssSelector("textarea[name='address']")).sendKeys("4 Comb Dr");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[name='bidDate']")).sendKeys("2020-01-30");
        WebElement button= driver.findElement(By.cssSelector("svg[role='presentation']"));
        Actions mouse = new Actions(driver);
        mouse.moveToElement(button).perform();
        mouse.click();
        driver.findElement(By.cssSelector("input[name='area']")).sendKeys("200");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println("PASS - Step1 fill");
    }
    public static void stepTwo(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//p[text()='Commercial']")).click();
        driver.findElement(By.cssSelector("input[value*='Retail']")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println("PASS - Step2 fill");
    }
    public static void stepThree(WebDriver driver){
        driver.findElement(By.xpath("//input[@name='permissions.4102886' and @value='view-only']")).click();
        driver.findElement(By.xpath("//input[@name='permissions.4102886' and @value='delete']")).click();
        driver.findElement(By.xpath("//input[@name='permissions.9450364' and @value='view-only']")).click();
        driver.findElement(By.xpath("//input[@name='permissions.9450364' and @value='edit']")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("PASS - Step3 fill");
    }

}
