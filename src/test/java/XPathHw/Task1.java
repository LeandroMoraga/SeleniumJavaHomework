package XPathHw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
task:
HW (only use XPATH)
1. navigate to fb.com
2. click on create new account
3. fill up all the text-boxes
4. close the popup
5. close the browser
Note:in order for your code to work
you have to put Thread.sleep(2000) after clicking on Create new account
that is the reason, will discuss in next lecture

syntax: tag-name[@attribute='attribute value']  --> finding by attribute
syntax: tag-name[text()='text value'] --> finding by text
syntax: tag-name[contains(@attribute, 'partial attribute value')] --> for contains
     */
    public static void main(String[] args) throws InterruptedException {
    // unique== 1/1
    WebDriver driver= new ChromeDriver(); // creating instance
    driver.get("https://www.facebook.com/"); // navigating to facebook.com
    driver.manage().window().maximize(); // maximizing the window
    WebElement createAcc=driver.findElement(By.xpath("//a[text()='Create new account']")); // 1/1
    Thread.sleep(2000); // 2-second sleep time to visualize it clicking the 'Create new account'
    createAcc.click();
    Thread.sleep(2000); // 2-second sleep time
    WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']")); // 1/1
    firstName.sendKeys("Leandro");
    WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']")); // 1/1
    lastName.sendKeys("Moraga");
    WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']")); // 1/1
    email.sendKeys("LeandrotheBesteever@gmail.com");
    WebElement reEnterEmail=driver.findElement(By.xpath("//input[contains(@name, 'confirmation__')]")); // 1/1
    reEnterEmail.sendKeys("LeandrotheBesteever@gmail.com");
    WebElement passWord=driver.findElement(By.xpath("//input[@name='reg_passwd__']")); // 1/1
    passWord.sendKeys("il0veJava4Life");
    WebElement month=driver.findElement(By.xpath("//option[text()='Mar']")); // 1/1
    month.click();
    WebElement day=driver.findElement(By.xpath("//option[text()='3']"));// 1/1
    day.click();
    WebElement year=driver.findElement(By.xpath("//option[text()='2002']")); // 1/1
    year.click();
    driver.findElement(By.xpath("//input[@value='2']")).click(); // 1/1
    Thread.sleep(3000); // 3-second sleep time
    driver.findElement(By.xpath("//img[@class='_8idr img']")).click(); // 1/1
    Thread.sleep(3000); // 3-second sleep time
    driver.quit(); // quitting the browser
    }
}
