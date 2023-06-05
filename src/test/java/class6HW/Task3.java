package class6HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Task3 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        task: HW3:
        develop a function in common methods to select from dropdown(single select)
         */

        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement days=driver.findElement(By.xpath("//select[@id='select-demo']"));
        singleSelectByValue(days,"Tuesday");
        singleSelectByIndex(days,2);
        singleSelectByText(days,"Friday");
    }
}
