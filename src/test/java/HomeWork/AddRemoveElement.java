package HomeWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AddRemoveElement {
    @Test
    public void checkAddingAndRemovalElements() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement targetAddElement = driver.findElement(By.xpath("//button[text()= 'Add Element']"));
        targetAddElement.click();
        Thread.sleep(500);
        targetAddElement.click();
        Thread.sleep(500);

        List<WebElement> targetDeleteElement = driver.findElements(By.xpath("//button[text()= 'Delete']"));
        for (WebElement c : targetDeleteElement) {
            c.click();
            Thread.sleep(1000);
        }

        driver.quit();
    }
}
