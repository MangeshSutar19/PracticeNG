package com.testng.practice;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class sampledependancyconceptgroup2 {
	@Test(groups = "smoke2")
 public void Method1()
 {
	 System.out.println("Method 1 -smoke 2 group");
 }

 @Test(groups = "smoke2")
 public void Method2()
 {
	 System.out.println(5/0);
	 System.out.println("Method 2 -smoke 2 group");	 
 }

 @Test(groups = "smoke2")
 public void Method3()
 {
	 System.out.println("Method 3 -smoke 2 group");
 }

 @Test(groups = "regression2")
 public void Method4()
 {
	 System.out.println("Method 4 -regression 2 group");
 }

@Test(dependsOnGroups =   {"smoke2"}, alwaysRun = true )
 public void Method0()
 {
	 System.out.println("Dependent group on smoke group");
 }

	
}
