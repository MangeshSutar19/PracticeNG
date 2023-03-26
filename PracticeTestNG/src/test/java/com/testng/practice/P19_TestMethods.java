package com.testng.practice;

import org.testng.annotations.Test;

public class P19_TestMethods {
	
	@Test(dataProvider = "testdata1" , dataProviderClass = P19_DataproviderClass.class)
	public void testMethods(String s)
	{
	   System.out.println(s);	
	}

}
