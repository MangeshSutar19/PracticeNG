package com.testng.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.*;

public class sampleDataProvider2 {
	
	
	@Test(dataProvider = "dataprovider")
	public void method(String[] str1 )
	{
		System.out.println(str1);
			for(int i = 0 ; i < str1.length; i++)
		{
			System.out.println(str1[i]);
		}
		
	}
	@DataProvider(indices = {0,2,1,3})
	public String[][] dataprovider()
	{
		
	String[][] s = new String[][] {{"Mangesh" ,"Shrawani","Leena"},{"Kalpesh", "Mahesh"}};
	return s;
	}
}