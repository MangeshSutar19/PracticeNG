package com.testng.practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P6_HardAssertionsVsSoftAssertionsInTestNG {
	
	@Test
	public static void TestFacebook_HardAssertion() throws InterruptedException
	{
		
		
		WebDriverManager.firefoxdriver().setup();
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
        Actions act = new Actions(driver);
        
	    driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Mangesh Sutar" , Keys.ENTER);
		Thread.sleep(7000);
		
		
		
		//Title
		String ExpectedTitle = "Log in to Facebook";
		String ActualTitle ;;
		ActualTitle = driver.getTitle();
		assertEquals(ActualTitle, ExpectedTitle , "Title does not matached");
		
		//URL
		Thread.sleep(5000);
		
		driver.navigate().back();
		String ExpectedURL = "https://www.facebook.com/";
		String ActualURL ;
		ActualURL = driver.getCurrentUrl();
		assertEquals(ActualURL, ExpectedURL , "URL does not matached");
		
		//TextEmpty
		
		String ExpectedText = "";
		String ActualText = driver.findElement(By.name("email")).getAttribute("value");
		assertEquals(ActualText,ExpectedText,"Text does not matached");
		
		//Border
		String ExpectedBorder = "1px solid rgb(27, 116, 228)";
		driver.findElement(By.name("email")).sendKeys(Keys.ENTER);
		String ActualBorder = driver.findElement(By.name("email")).getCssValue("border"); 
		assertEquals(ActualBorder,ExpectedBorder,"Border does not matached");
		
		driver.quit();
			
		
	}
	@Test
	public static void TestFacebook_SoftAssertion() throws InterruptedException
	{

		
		WebDriverManager.firefoxdriver().setup();
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
        Actions act = new Actions(driver);
        
	    driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Mangesh Sutar" , Keys.ENTER);
		Thread.sleep(7000);
		
		
		
		//Title
		String ExpectedTitle = "Log in to Facebook";
		String ActualTitle ;;
		ActualTitle = driver.getTitle();
		assertEquals(ActualTitle, ExpectedTitle , "Title does not matached");
		SoftAssert sa = new SoftAssert();
		
		//URL
		Thread.sleep(5000);
		
		driver.navigate().back();
		String ExpectedURL = "https://www.facebook.com/";
		String ActualURL ;
		ActualURL = driver.getCurrentUrl();
		sa.assertEquals(ActualURL, ExpectedURL , "URL does not matached");
		
		//TextEmpty
		
		String ExpectedText = "test";
		String ActualText = driver.findElement(By.name("email")).getAttribute("value");
		sa.assertEquals(ActualText,ExpectedText,"Text does not matached");
		
		//Border
		String ExpectedBorder = "1px solid rgb(27, 116, 228)";
		driver.findElement(By.name("email")).sendKeys(Keys.ENTER);
		String ActualBorder = driver.findElement(By.name("email")).getCssValue("border"); 
		sa.assertEquals(ActualBorder,ExpectedBorder,"Border does not matached");
		
		driver.quit();
		sa.assertAll(); //any failuregot in execution then it will caught at the end of execution
			
			
	}

}
