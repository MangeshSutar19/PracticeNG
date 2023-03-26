package com.testng.practice;

import org.testng.annotations.Test;
import org.testng.annotations.*;
@Test (groups = "all")
public class samplegrupclass1 {

	@Test(groups = {"smoke", "functional"})
	public void  method1()
	{
		System.out.println("Method 1");
	}

	@Test(groups = {"sanity", "functional"})
	public void  method2()
	{

		System.out.println("Method 2");
	}

	@Test(groups = {"smoke", "sanity"})
	public void  method3()
	{

		System.out.println("Method 3");
	}

	@Test(groups = {"Regression", "functional"})
	public void  method4()
	{

		System.out.println("Method 4");
	}
}
