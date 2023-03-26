package com.testng.practice;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class P20_ReadDataFromExcel {
	
	@Test(dataProvider = "ExcelDataSupplier" , dataProviderClass = P20_ReadingDataFromExeclSheet.class)
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

}
