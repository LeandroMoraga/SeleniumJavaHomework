package class6HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Task2 extends CommonMethods {
    public static void main(String[] args) {
        /*
        task: HW2:
        go to http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
        click on get new user
        print the firstname of user
         */

        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement button = driver.findElement(By.xpath("//button[@id='save']"));
        button.click();

        WebElement firstname = driver.findElement(By.xpath("//p[contains(text(),'First Name :')]"));
        String text = firstname.getText();
        System.out.println("Result:: "+text);
    }
}
