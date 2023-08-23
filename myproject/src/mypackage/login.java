package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class login {
	static String name="Raju";
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriv//chromedriver_win32//chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
		//WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.id("inputUsername")).sendKeys(name);
	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	
	// Selecting checkbox
	WebElement cbox=driver.findElement(By.id("chkboxOne"));
	
	// this will toogle the checkbox
	cbox.click();
	
	//Check wheathere the checkbox is toggled on/off
	if(cbox.isSelected())
	{
		System.out.println("Remember me my password is Selected");
	}
	else
	{
		System.out.println("Remember me my password is not Selected");
	}

	WebElement cbox2=driver.findElement(By.id("chkboxTwo"));
	cbox2.click();
	
	//driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
	driver.findElement(By.className("submit")).click();
	
	//	driver.close();
	Thread.sleep(2000);
	//System.out.println(driver.findElement(By.tagName("p")).getText());
	//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	
	System.out.println(driver.findElement(By.xpath("//*[@id='root']/div/div/div/p")).getText());
	
    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='root']/div/div/div/p")).getText(),"You are successfully logged in.");
	
	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello "+name+",");
   
}
}
