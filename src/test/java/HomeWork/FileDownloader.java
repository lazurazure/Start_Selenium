package HomeWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FileDownloader {
    @Test
    public void checkFileDownloader() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/download");

        List<WebElement> DownloadFiles = driver.findElements(By.xpath("//div[@class='example']/child::a"));

        for (WebElement c: DownloadFiles) {
            c.click();
            Thread.sleep(1000);
        }

        driver.quit();
    }
}
