package class7HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
        /*
        task: HW:
        go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        click on PIM
        from the table choose any ID
        and print out the row number of that id
        please make sure that ur code is dynamic enough to cater if another row gets deleted , it still prints the row correctly

         */
        /*
        username=Admin
        pass=Hum@nhrm123
         */
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");

        WebElement passWord=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passWord.sendKeys("Hum@nhrm123");

        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        WebElement PIM=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        PIM.click();

        List<WebElement> allIDS=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        // id I want --> 55804A
        for(int i=0;i<allIDS.size();i++){
            String idText=allIDS.get(i).getText();
            if(idText.equals("55804A")){
                System.out.println("Row number of ID 55804A is on:: "+(i+1));
            }
        }
    }
}
S