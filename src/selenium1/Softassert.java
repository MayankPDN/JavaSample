package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
SoftAssert obj=new SoftAssert();

	@Test
	public void verifyTitle(){
		System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.com/");
	String pageTitle=driver.getTitle();
	System.out.println(pageTitle);
	obj.assertEquals(pageTitle,"Google");/*it will not report any failure message and will show passed*/
	driver.close();

	
	driver.close();/*This line wont be executed as assert failing will stop then and there*/
	
	}
}
