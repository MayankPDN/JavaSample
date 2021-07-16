package selenium1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Test.Utility.TestUtility;

public class useexcelfordata {

	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
			System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
			 driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
	}
	@DataProvider
		public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData= TestUtility.getdataFromExcel();
		return testData.iterator();
	
		
	}
	
	@Test (dataProvider="getTestData")
	public void NC2(String FirstNmae, String LastNmae ,String EMail , String Phone , String StreetAddress, String City,String Zipcode
) {
		driver.findElement(By.name("first_name")).sendKeys("FirstNmae");
		driver.findElement(By.name("last_name")).sendKeys("LastNmae");
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("EMail");
		driver.findElement(By.name("phone")).sendKeys("Phone");
		driver.findElement(By.name("address")).sendKeys("StreetAddress");
		driver.findElement(By.name("city")).sendKeys("City");
		driver.findElement(By.name("zip")).sendKeys("Zipcode");
	
			


	}
 
		}
			
		

