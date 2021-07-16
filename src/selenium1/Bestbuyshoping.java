package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Bestbuyshoping {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      driver.get("https://www.bestbuy.ca/en-ca");
	      driver.findElement(By.cssSelector("li:nth-child(1) button > span")).click();
	      driver.findElement(By.linkText("Musical Instruments")).click();
	      
	      driver.findElement(By.xpath("//p[text()='Guitars and Accessories']")).click();
	      driver.findElement(By.xpath("//p[text()='Electric Guitars']")).click();
	      driver.findElement(By.xpath("//div[contains(text(),'California Classic')]")).click();
	      driver.findElement(By.xpath("//button[@type='submit'and@class='button_2Xgu4 primary_oeAKs addToCartButton_1DQ8z addToCartButton regular_cDhX6']")).click();
	      
	      
	     
	      
	      
	      
	      
	    
	      
		
		
	}

}
