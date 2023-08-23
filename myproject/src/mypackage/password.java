package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class password {
	
	public static void main(String[] args) throws InterruptedException {
		 String name="Maa";
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriv//chromedriver_win32//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options); 
		//WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password= passwordtext(driver);
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.logout-btn")).click();
		driver.get("https://rahulshettyacademy.com/");

	}
	public static String passwordtext(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/button[2]")).click();
		
		String passwordText=driver.findElement(By.xpath("//p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordarray=passwordText.split("'");
		String password=passwordarray[1].split("'")[0];
		Thread.sleep(1000);
		return password;
		
		
		
		
		//0th index =Please use temporary password sub
		//1stindex =rahulshettyacademy' to Login.
	}

}
