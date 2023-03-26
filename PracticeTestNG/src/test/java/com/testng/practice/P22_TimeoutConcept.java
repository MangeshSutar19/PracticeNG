package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P22_TimeoutConcept {
	
	@Test(timeOut= 2000)
	public void visitSite()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.close();
		
	}

}
