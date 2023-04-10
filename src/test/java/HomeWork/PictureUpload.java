package HomeWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class PictureUpload  {
    @Test
    public void checkImageUpload() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        try{
            driver.findElement(By.id("file-upload")).sendKeys("C:/Users/Admin/Desktop/P4110065.jpg");
            driver.findElement(By.id("file-submit")).submit();

            Thread.sleep(1000);
            if(driver.getPageSource().contains("File Uploaded!")) {
                System.out.println("file uploaded");
            }
            else{
                System.out.println("file not uploaded");
            }
            Thread.sleep(500);

            assertTrue(driver.getPageSource().contains("File Uploaded!"));
        } finally {
//            System.out.println("A mistake has occured"); - позволяет увидеть где произошла ошибка
            Thread.sleep(2000);
        }

        driver.quit();
    }
}
