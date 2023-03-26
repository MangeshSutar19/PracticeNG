package com.testng.practice;

import org.testng.annotations.Test;

public class P15_DependencyOnGroup2 {
	
	
	@Test(groups="smoke1")
	public void test1()
	{
		System.out.println("Test 1-Smoke group");
	}
	
	@Test(groups="smoke1")
	public void test2()
	{
		System.out.println("Test 2-Smoke group");
	}

	
	@Test(groups="smoke1")
	public void test3()
	
	{  
		System.out.println(5/0);
		System.out.println("Test 3-Smoke group");
	}

	
	
	@Test(groups="smoke1")
	public void test4()
	
	{   
		System.out.println("Test 4-Smoke group");
	}

	
	
	@Test(groups="sanity1")
	public void test5()
	
	{   
		System.out.println("Test 5-sanity group");
	}

	
	
	@Test(groups="sanity1")
	public void test6()
	
	{   
		System.out.println("Test 6-sanity group");
	}

	@Test(groups="regression1")
	public void test7()
	
	{   
		System.out.println("Test 7-regression group");
	}

	
	
	@Test(groups="regression1")
	public void test8()
	
	{   
		System.out.println("Test 8-regression group");
	}

}
