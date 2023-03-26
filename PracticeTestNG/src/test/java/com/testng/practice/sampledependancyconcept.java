package com.testng.practice;

import org.testng.annotations.*;

public class sampledependancyconcept {

	static String PNR  =null;
	//System.out.println(5/0);

	//@Ignore
	@Test
	public void generatePNR()
	{
		PNR ="1001" ;
		//System.out.println(5/0);
		System.out.println("PNR generated sucessfully ");
	}
	@Test(dependsOnMethods = { "generatePNR"}, alwaysRun = true ,  ignoreMissingDependencies = true)
	public void checkstatusOfPNR() throws Exception
	{
		if(PNR !=null)
		{
			System.out.println("status of PNR is new");
		}
		else
		{
		   throw new Exception ("PNR is not generated");
			
		}
	}

	@Test (dependsOnMethods = { "generatePNR"}, ignoreMissingDependencies = true)
	public void canclePNR()throws Exception
	{

		if(PNR !=null)
		{
			System.out.println("Cancelled sucessfully");
		}
		else
		{
			throw 	new Exception ("PNR is not generated");
			
		}
	}
	
}
