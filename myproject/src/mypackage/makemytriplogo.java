package mypackage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;



public class makemytriplogo {

	public static void main(String[] args) throws InterruptedException {
		
		//Webdriver.gecko.driver
		System.setProperty("webdriver.chrome.driver","C://Program Files//chromedriv//chromedriver_win32//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options); 
		//WebDriver driver= new ChromeDriver();
		 Thread.sleep(5000);
		 driver.get("http://www.makemytrip.com");
		 driver.manage().window().maximize();
		//isDisplayed() method returns boolean value either True or False
		 driver.switchTo().frame("~184fc0b7");
		 System.out.println("********We are switch to the iframe*******");
		 driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.className("span.chNavText.darkGreyText")).click();
		
	}

}
