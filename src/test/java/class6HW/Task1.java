package class6HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
        /*
        task:HW1:
        go to http://practice.syntaxtechs.net/dynamic-elements-loading.php
        click on start
        print the text "welcome syntax technologies "on console
         */
        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement button=driver.findElement(By.xpath("//button[@id='startButton']"));
        button.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']"),"Welcome Syntax Technologies"));
       // wait.until(ExpectedConditions.textToBe(By.xpath("//h4[text()='Welcome Syntax Technologies']"),"Welcome Syntax Technologies"));
        WebElement syntaxText=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text=syntaxText.getText();
        System.out.println("The text of the task is:: "+text);
    }
}
