package com.testng.practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class P14_TestDependency {
	
	static String trackingNumber = null;
	@Ignore
	@Test()
	public void createShipment()
	{
        //System.out.println(5/0); 
		System.out.println("Shipment created sucessfully");
		trackingNumber = "ABCD12345";
	}
	@Test( dependsOnMethods = {"createShipment"}, alwaysRun = true, ignoreMissingDependencies= true)
	public void trackShipment() throws Exception
	{
		if(trackingNumber != null)
		{
			
		System.out.println("Shipment tracked sucessfully");
		}
		else
		{
			throw new Exception("Invalid tracing number");
		}
	}
	@Test( dependsOnMethods = {"createShipment","trackShipment"}, ignoreMissingDependencies= true)
	public void cancelShipment() throws Exception
	{
		if(trackingNumber != null)
		{
			
		System.out.println("Shipment cancelled sucessfully");
		}
		else
		{
			throw new Exception("Invalid tracing number");
		}
	}

}
