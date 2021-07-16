package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insurancequote {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      driver.get("https://ui.cogmento.com/");
	      driver.findElement(By.xpath("//input[@type='text'and@name='email']")).sendKeys("all_mayanl@yahoo.co.in");
	      driver.findElement(By.xpath("//input[@type='password'and@name='password']")).sendKeys("Test1@1@1@");
	      driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	      //driver.findElement(By.
	      

	}

}
