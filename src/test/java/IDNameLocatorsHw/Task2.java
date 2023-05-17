package IDNameLocatorsHw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
    task:
navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
enter the username "Tester"
enter the password "test"
get the title of the webPage and confirm that it is  "Web Orders Login"
Note: use name or id as locators
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        String title=driver.getTitle();
        System.out.println(title);
        Thread.sleep(5000);
        if(title.equals("Web Orders Login")){
            System.out.println("Confirmed:Title is correct");
        }else{
            System.out.println("Not Confirmed:Title is not correct");
        }
        driver.quit();
    }
}
