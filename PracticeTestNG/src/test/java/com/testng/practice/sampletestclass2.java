
package com.testng.practice;

import org.testng.annotations.Test;

public class sampletestclass2 {

	@Test (priority = 0)
	public void zuser()
	{
		System.out.println("1");
	}
	@Test (priority = 1)

	public void yuser() 
	{
		System.out.println("2");		
	}
	
	@Test (priority = 3)

	public void askuser()
	{
		System.out.println("3");
	}
	@Test(priority = -1)

	public void baduser()
	{
		System.out.println("4");
	}
	@Test(priority =5)

	public void kilouser()
	{
		System.out.println("5");
	}
	@Test (priority = 6)

	public void ser()
	{
		System.out.println("6");
	}
}
