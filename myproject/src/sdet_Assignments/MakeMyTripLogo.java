package sdet_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTripLogo {

	public static void main(String[] args) throws InterruptedException {
		
		// Calling Chrome WebDriver
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriv\\chromedriver_win32\\chromedriver.exe");
	      ChromeOptions options = new ChromeOptions();
	  	options.addArguments("--remote-allow-origins=*");
	      WebDriver driver = new ChromeDriver(options);
		  
		// Maximizing window
		  driver.manage().window().maximize(); 
		  
		// open URL
		  driver.get("https://www.makemytrip.com/");
		
		  Thread.sleep(5000);
		  
		 boolean logoText = driver.findElement(By.xpath("//*[@class='mmtLogo makeFlex']")).isDisplayed();
		// Verifying logo text if it is present print as logo is present
		  if(logoText == true) {
			  System.out.println("logo is present");
		  }else {
			  System.out.println("logo is not present");
		  }
		  
		 
	}
	
}
