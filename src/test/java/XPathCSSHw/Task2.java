package XPathCSSHw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /**
     *HW2:
     * Go to  “<a href="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D">...</a>
     * Enter valid username
     * Leave password field empty
     * Click on login button
     * Verify error message with text “Password cannot be empty” is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver(); // creating instance/object of ChromeDriver
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D"); // navigating to URL
        driver.manage().window().maximize();
        WebElement userName=driver.findElement(By.cssSelector("input[name='txtUsername']"));
        userName.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement logInButton=driver.findElement(By.cssSelector("input[id='btnLogin']"));
        logInButton.click();
        WebElement errorMessage=driver.findElement(By.cssSelector("span[id='spanMessage']"));
        String message=errorMessage.getText();
        System.out.println(message);

        if(message.equals("Password cannot be empty")){
            System.out.println("Error message is displayed on Syntax HRM Webpage");
        }else{
            System.out.println("Error message is not displayed");
        }
        driver.quit();
    }
}
