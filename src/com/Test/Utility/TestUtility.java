package com.Test.Utility;

import java.util.ArrayList;

import com.excel.utilily.Xls_Reader;

public class TestUtility {
static Xls_Reader reader;

	public static ArrayList<Object[]> getdataFromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
		reader= new Xls_Reader("C:\\Users\\Mayank Gohil\\eclipse-workspace\\testing\\src\\exceldata\\sampletestdata.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		for (int rowNum =2; rowNum <=reader.getRowCount("Sheet1"); rowNum++) {
			String FirstNmae = reader.getCellData("Sheet1", "FirstNmae", rowNum);
			String LastNmae = reader.getCellData("Sheet1", "LastNmae", rowNum);
			String EMail = reader.getCellData("Sheet1", "EMail", rowNum);
			String Phone = reader.getCellData("Sheet1", "Phone", rowNum);
			String StreetAddress = reader.getCellData("Sheet1", "StreetAddress", rowNum);
			String City = reader.getCellData("Sheet1", "City", rowNum);
			String Zipcode = reader.getCellData("Sheet1", "Zipcode", rowNum);
			
			Object ob[] = {FirstNmae, LastNmae, EMail, Phone, StreetAddress, City, Zipcode};
			myData.add(ob);
		}
		return myData;
	}
	
}
