package com.Test.Utility;

import java.util.ArrayList;

import com.excel.utilily.Xls_Reader;



public class UtilityForRoicians {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getdataFromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
		reader= new Xls_Reader("C:\\Users\\Mayank Gohil\\eclipse-workspace\\testing\\src\\testdataForRoicians\\RoiciansExceldata.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		for (int rowNum =2; rowNum <=reader.getRowCount("Sheet1"); rowNum++) {
			
		
			String YourName = reader.getCellData("Sheet1", "YourName", rowNum);
			String YourEmail = reader.getCellData("Sheet1", "YourEmail", rowNum);
			String Subject = reader.getCellData("Sheet1", "Subject", rowNum);
			String YourMessage = reader.getCellData("Sheet1", "YourMessage", rowNum);
			
			
			Object ob[] = {YourName, YourEmail, Subject, YourMessage};
			myData.add(ob);
		}
		return myData;
	}
}
