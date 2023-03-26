package com.testng.practice;

import org.testng.annotations.*;

@Test (groups = "all")

public class samplegrupclass2 {

	@Test(groups = {"smoke", "functional" , "regression"})
	public void  method5()
	{
		System.out.println("Method 5");
	}

	@Test(groups = { "functional"})
	public void  method6()
	{

		System.out.println("Method 6");
	}

	@Test(groups = {"smoke"})
	public void  method7()
	{

		System.out.println("Method 7");
	}

	@Test(groups = {"sanity"})
	public void  method8()
	{

		System.out.println("Method 8");
	}

	@Test(groups = {"regression"})
	public void  method9()
	{

		System.out.println("Method 9");
	}
	

	public void  method10()
	{

		System.out.println("Method 10");
	}
	
	
}
