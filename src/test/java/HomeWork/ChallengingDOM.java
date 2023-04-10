package HomeWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChallengingDOM {
    @Test
    public void checkChallengingDOM() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        WebElement targetButtons1 = driver.findElement(By.xpath("//a[@class='button']"));
        targetButtons1.click();
        Thread.sleep(1000);

        WebElement targetButtons2 = driver.findElement(By.xpath("//a[@class='button alert']"));
        targetButtons2.click();
        Thread.sleep(1000);

        WebElement targetButtons3 = driver.findElement(By.xpath("//a[@class='button success']"));
        targetButtons3.click();
        Thread.sleep(1000);

        driver.quit();

    }
}
//         List<WebElement> targetButtons = driver.findElements(By.xpath("//div[@class='large-2 columns']/child::a"));
//        for (WebElement c: targetButtons) {
//            c.click();
//            Thread.sleep(1000);
//        }