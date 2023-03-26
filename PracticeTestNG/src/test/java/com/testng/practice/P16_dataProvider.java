package com.testng.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P16_dataProvider {
    
	@Test(dataProvider = "logintestdata")
	public void NewtoursLogin(String username, String password) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
		
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
        driver.close();
	
	}
	@DataProvider
	public Object[][] logintestdata()
	{
		Object[][] data = new Object[2][2];
		//valid data
		data[0][0]= "test";
		data[0][1]="test@123";		
	    
		
		//invalid
		data[1][0]= "mangesh";
		data[1][1]="mangesh@123";	
		
		return data;
	    
	}
	
	
}
