package com.testng.practice;

import org.testng.annotations.Test;

public class P15_DependencyOnGroup {
	
	
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
	
	{   //System.out.println(5/0);
		System.out.println("Test 3-Smoke group");
	}
	
	@Test(dependsOnGroups ="smoke1" )
	public void test0()
	{
		System.out.println("Test 4-Smoke group-MAIN");
	}

}
