package com.testng.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P18_indicesConcept {

	
	@Test (dataProvider  ="dataprovider")
	public void TestMethods(String S)
	{
		System.out.println(S);
	}
	@DataProvider(indices = {0 , 2})
	public String[] dataprovider()
	{
		String[] Str = new String[] {"Mangesh" , "Sutar" ,"Shreya" , "Shrawani"} ;  
	    return Str;
	}
}

