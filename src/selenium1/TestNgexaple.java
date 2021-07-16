package selenium1;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class TestNgexaple {
	
	@Test(priority=1)
	public void Writetestcase() {
	System.out.println("First Write test case");
	}
	@Test (priority=2)
	public void Execute_test() {
		System.out.println("Second execute test cases");
		
	}
	@Test (priority=3)
	public void Defect_log() {
		System.out.println("Then Log Defects");
	}
	}
	