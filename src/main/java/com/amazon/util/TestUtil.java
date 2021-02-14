package com.amazon.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.amazon.base.TestBase;
import com.google.common.io.Files;


public class TestUtil extends TestBase{

	static Workbook book;
	static Sheet sheet;
	public static String TESTDATA_SHEET_PATH= "C:\\Users\\ankit\\eclipse-workspace\\AmazonTest\\src\\main"
			+ "\\java\\com\\amazon\\testdata\\AmazonTestData.xlsx";
	
	public static Object [][] getTestData(String sheetName)
	{
		FileInputStream fis = null;
		
		try {
			fis= new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		sheet = book.getSheet(sheetName);
			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int i=0;i<sheet.getLastRowNum();i++)
			{
				for(int j=0;j<sheet.getLastRowNum();j++)
				{
					data[i][j]=sheet.getRow(i+1).getCell(j);
				}
			}
			return data;
	}
	
	public static void takeScreenshotAtEndOfTest() throws IOException
	{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir= System.getProperty("user.dir");
		Files.copy(src, new File(currentDir + "/screenshots/" +System.currentTimeMillis() + ".png"));
	}
	
}
