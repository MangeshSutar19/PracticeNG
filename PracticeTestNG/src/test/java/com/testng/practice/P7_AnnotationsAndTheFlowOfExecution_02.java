package com.testng.practice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class P7_AnnotationsAndTheFlowOfExecution_02 {

	WebDriver driver;


	@BeforeTest
	public void beforeTest_InitialiseBrowser() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	} 
	@Test
	public void launchApp()
	{
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	@Test
	public void VerifyTitle() {

		System.out.println(driver.getTitle());
	}

	@Test
	public void VerifyCurrentURL() {
		System.out.println(driver.getCurrentUrl()); 

	}

	@AfterTest
	public void afterTest_TearDown() {

		driver.close();
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
