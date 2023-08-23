package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
public class w3schoolslogo{
   public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriv\\chromedriver_win32\\chromedriver.exe");
      ChromeOptions options = new ChromeOptions();
  	options.addArguments("--remote-allow-origins=*");
      WebDriver driver = new ChromeDriver(options);
      Thread.sleep(2000);
     // driver.manage().timeouts().implicitlyWait(Duration,30);
     driver.get("https://www.w3schools.com");
    Thread.sleep(2000);
      //identify image
      WebElement i = driver.findElement
      (By.xpath("//*[contains(@title,'Home')]"));
      // Javascript executor to check image
      Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

      //verify if status is true
      if (p) {
         System.out.println("Logo present");
      } else {
         System.out.println("Logo not present");
      }
      driver.quit();
   }
}