package selenium1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NgBeforeAfter {

	
	
	@BeforeTest
	public void OpenBrowser() {
		System.out.println("Browser Must Open");
		}
@Test(priority=1)
public void Writetestcase() {
	
System.out.println("First Write test case");
}
@Test(priority=2)
public void Execute_test() {
	System.out.println("Second execute test cases");
	
}
@AfterTest 
/*sequence doesnot matter, we can write this anywhere in class it will 
execute after completion only*/
public void CloseBrowser() {
	System.out.println("Browser Must Close");
	}
@Test(priority=3)
public void Defect_log() {
	System.out.println("Then Log Defects");
}

}
