package com.testng.practice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleReadThedataFromExcel {
	
	
	@Test(dataProvider = "loginData", invocationCount = 2 ) 
	public void testMethds(String username , String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		ChromeOptions options = new ChromeOptions();

		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(username);
		driver.findElement(By.name("submit")).click();
	
		driver.quit();
	}
	
	@DataProvider(name = "loginData", parallel = true)
	public Object[][] dp1() throws Exception
	{
		File f = new File ("/home/mangeshs/eclipse-workspace/PracticeTestNG/P20_Excel/Test.xls");
		System.out.println("Is file exist " +f.exists());
		System.out.println("Size of File " +f.length());
		
		FileInputStream fis = new FileInputStream(f);
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet("XLS format");
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfCol = sheet.getRow(0).getLastCellNum();
		
		System.out.println(noOfRows);
		System.out.println(noOfCol);
		
		
		Object	Data[][] = new Object[noOfRows-1][noOfCol];
		
		for(int i = 0 ;i < noOfRows-1 ; i ++)
		{
			for(int j = 0 ; j < noOfCol ; j++)
			{
				DataFormatter df = new DataFormatter();
				Data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
		}

	workbook.close();
	fis.close();
	return Data;
	}
			

}
