package com.testng.practice;

import org.testng.annotations.DataProvider;

public class P19_DataproviderClass {
	
	@DataProvider
	public String[] testdata()
	{
		String[] str = new String[] {"Man" , "Test" ,"Test1"};
		
		return str;
	}

	
	@DataProvider
	public String[] testdata1()
	{
		String[] str = new String[] {"Sunil" , "Mangesh" ,"Mangu"};
		
		return str;
	}

}
