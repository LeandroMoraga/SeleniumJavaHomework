package class4HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends CommonMethods {
    /*
     * task:
     * HW1:
     * go to <a href="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php">...</a>
     * select,tuesday,thursday and friday one by one
     **/
    public static void main(String[] args)  {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement days=driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select sel= new Select(days);
        sel.selectByVisibleText("Tuesday");
        sel.selectByValue("Thursday");
        sel.selectByIndex(6);
    }
}
