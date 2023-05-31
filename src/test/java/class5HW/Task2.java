package class5HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) {
        /*
        task: HW2:
        go to https://chercher.tech/practice/frames, click on check box
        then select baby cat from drop down, then enter text in text box
         */
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        WebElement DD=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel= new Select(DD);
        sel.selectByValue("babycat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");

        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Homework time");
    }
}
