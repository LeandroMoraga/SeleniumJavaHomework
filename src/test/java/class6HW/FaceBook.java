package class6HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class FaceBook extends CommonMethods {
    public static void main(String[] args) {
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement button=driver.findElement(By.xpath("//a[text()='Create new account']"));
        button.click();

        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        sendText(firstName,"Leandro");


    }
}
