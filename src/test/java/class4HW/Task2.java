package class4HW;


import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    /*
     * task:
     * HW2:
     * go to facebook.com
     *  click on create account
     * and select your date of birth using select class
     **/
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement createAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select m=new Select(month);
        m.selectByVisibleText("Mar");

        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        Select d=new Select(day);
        d.selectByValue("3");

        WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select y=new Select(year);
        y.selectByIndex(19);

        WebElement x=driver.findElement(By.xpath("//img[contains(@class,'r img')]"));
        x.click();

    }
}
