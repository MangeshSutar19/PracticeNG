package com.testng.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.testng.annotations.DataProvider;

public class P20_ReadingDataFromExeclSheet {

	@DataProvider(parallel  = true)
	public String[][] ExcelDataSupplier() throws Exception {
		// TODO Auto-generated method stub
		
		File file = new File("/home/mangeshs/eclipse-workspace/PracticeTestNG/P20_Excel/Test.xls");
		System.out.println("File is present at location " +(file.exists()));  // will tell file is present or not at the given location
		System.out.println("Size of file in bytes" +(file.length()));  // will tell the size of the file in byte
		
		FileInputStream fis = new FileInputStream(file);  // will convert file data into the raw data and store into fis instance
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);  //insert row data into workbook
		HSSFSheet sheet = workbook.getSheet("XLS format");
	
		
		int noOfRows = sheet.getPhysicalNumberOfRows();  // will get no of rows
		int noOfCol = sheet.getRow(0).getLastCellNum();   // will get no of column
		
		System.out.println(noOfRows); 
		System.out.println(noOfCol);
		
		
		String data[][] = new String[noOfRows-1][noOfCol];
		
		for(int i = 0; i < noOfRows-1 ;i ++ )   //we have taken noforow -1  so that it will take value till physically present no rows only

		{
			for( int j= 0 ; j< noOfCol ; j++)
			{
				DataFormatter df = new DataFormatter();
	          data[i][j]=	df.formatCellValue(sheet.getRow(i+1).getCell(j));  // it will convert any type of data into normal string
				
			//WE have taken i+1 so that it will skip the header value from the sheet and will consider rest values 
			
			//String valueOfString  = sheet.getRow(i).getCell(j).getStringCellValue(); to read the string value
				//System.out.print(valueOfString);
					       		

			}
			
		}
/*		 for(String dataArray[] : data)
		 {
			 System.out.println(Arrays.toString(dataArray));
		 }*/

		workbook.close();
		fis.close();
		
		return data;

	}

}
