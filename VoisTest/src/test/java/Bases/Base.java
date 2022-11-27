package Bases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	
	public static WebDriver driver;
	 public static void launch_browser(){
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demo.nopcommerce.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 }
	
	/*
	public WebDriver Driver;
	 public Base(WebDriver driver){
		 this.Driver = driver;
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demo.nopcommerce.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 }
*/
}
