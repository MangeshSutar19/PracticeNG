package com.testng.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleDataProvider {

@Test(dataProvider  = "loginData")	
	public void lauchappwithDifferentData(String username , String password)
	{
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.findElement(By.name("userName")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("submit")).click();
        
        driver.quit(); 
        
	}
	


	@DataProvider(name= "logindata")
	public Object[][]  loginData()
	{
		
		Object[][] data = 
		{
			{"admin" , "admin@123"},
			{"mangesh", "mangesh@123"}
			
		};
		
		return data;
	}
	
}
