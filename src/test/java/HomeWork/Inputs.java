package HomeWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputs {
    @Test
    public void checkInputs() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/inputs");

        WebElement searchInput = driver.findElement(By.tagName("input"));
        searchInput.sendKeys("1" + Keys.ENTER);
        Thread.sleep(500);
        searchInput.clear();
        Thread.sleep(1000);
        searchInput.sendKeys("2" + Keys.ENTER);
        Thread.sleep(500);
        searchInput.clear();
        Thread.sleep(1000);
        searchInput.sendKeys("-1" + Keys.ENTER);
        Thread.sleep(500);
        searchInput.clear();
        Thread.sleep(1000);
        searchInput.sendKeys("-2" + Keys.ENTER);
        Thread.sleep(500);
        searchInput.clear();
        Thread.sleep(1000);

        driver.quit();
    }
}
