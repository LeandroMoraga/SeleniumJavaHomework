package Utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CommonMethods {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(String url,String browser){
        switch(browser){
            case "chrome":
                driver= new ChromeDriver();
                break;
            case "firefox":
                driver= new FirefoxDriver();
                break;
            case "IE":
                driver= new InternetExplorerDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


    public static void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }

    public static void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }

    public static void singleSelectByValue(WebElement element,String byValue){
        Select sel = new Select(element);
        sel.selectByValue(byValue);
    }

    public static void singleSelectByText(WebElement element,String byText){
        Select sel = new Select(element);
        sel.selectByVisibleText(byText);
    }


    public static void singleSelectByIndex(WebElement element,int index){
        Select sel = new Select(element);
        sel.selectByIndex(index);
    }
}
