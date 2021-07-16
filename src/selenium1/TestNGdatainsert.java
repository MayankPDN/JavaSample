package selenium1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGdatainsert {

	@Test(dataProvider="getData")//2nd step
	public void Readdata(String username,String Password,String Expected, String Browser)//3rd step 
	{
		//input parameter should be same as defined in object array
		
	}
	@DataProvider
	public Object[][] getData(){
	Object[][]data=new Object[3][4];//1st step then link it to data provider	
	//1st Row
	data[0][0]="Mayank";
	data[0][1]="XYZ";
	data[0][2]="12/10/1387 ";
	data[0][3]="london";
	//2nd Row
	data[1][0]="Tom";
	data[1][1]="ggdg";
	data[1][2]="12/25/1234";
	data[1][3]="hammersmith";

	//3rd Row
	data[2][0]="Harry";
	data[2][1]="kkk";
	data[2][2]="08/12/2024";
	data[2][3]="wembley";
	return data;
	}
	

}
