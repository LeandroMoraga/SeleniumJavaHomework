package class8HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        /*
        task: HW1:
        go to syntax hrms
        1. login, 2.click on recruitment, 3. select a date on the calendar
         */
         /*
        username=Admin
        pass=Hum@nhrm123
         */

        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");

        WebElement passWord = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        passWord.sendKeys("Hum@nhrm123");

        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        WebElement recruitment = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitment.click();

        WebElement calendar = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calendar.click();

        WebElement monthDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select month = new Select(monthDD);
        month.selectByVisibleText("Mar");

        WebElement yearDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select year = new Select(yearDD);
        year.selectByValue("2004");


        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));

       /*
       I want March, 3rd, 2004
        */
        for (WebElement day : days) {
            String dayText = day.getText();
            if (dayText.equals("3")) {
                day.click();
                break;
            }
        }
    }
}
