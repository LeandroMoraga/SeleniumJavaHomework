package IDNameLocatorsHw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    task:
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
   close the browser
  Note: use name or id as locators
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Leandro");
        driver.findElement(By.id("customer.lastName")).sendKeys("Moraga");
        driver.findElement(By.id("customer.address.street")).sendKeys("3040 Clarendon Boulevard");
        driver.findElement(By.name("customer.address.city")).sendKeys("Annadale");
        driver.findElement(By.name("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22305");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("798-456-3543");
        driver.findElement(By.name("customer.ssn")).sendKeys("456742");
        driver.findElement(By.id("customer.username")).sendKeys("LeandroMoraga");
        driver.findElement(By.id("customer.password")).sendKeys("Java4life$");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Java4llife$");
        Thread.sleep(5000);
        driver.quit();
    }
}
