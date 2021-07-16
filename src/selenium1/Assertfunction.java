package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfunction {

	@Test
	public void verifyTitle(){
		System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.com/");
	
	String pageTitle=driver.getTitle();
	
	
	Assert.assertEquals(pageTitle,"Google");
	
	driver.close();/*This line wont be executed as assert failing will stop then and there*/

	}
}
