package com.testng.practice;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class sampletestclass {
	
	WebDriver driver;
	@Parameters("browsername")
	@BeforeTest
	public void openbrowser(@Optional("chrome") String browserName)
	{
       switch(browserName.toLowerCase())
       {
       case "chrome" :
    	   WebDriverManager.chromedriver().setup();
    	   driver = new ChromeDriver();
           break;
           
       case "firefox" :
    	   WebDriverManager.firefoxdriver().setup();
    	   driver = new FirefoxDriver();
    	   
           break;
       default :
    	   System.out.println("Invalid name");
    	   break;
       }
       driver.manage().deleteAllCookies();
       driver.manage().window().maximize();
	}

	@Parameters ("url")
	@Test
	public void launchapp(@Optional("https://demo.guru99.com/test/newtours/index.php") String url)
	{
       driver.get(url); 
	}
	
	@Parameters({"username", "password"})
	@Test
	public void loginIntoApp( String username, String pwd) throws InterruptedException
	{
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
	}
	
	@Test
	public void logout()
	{
      // String expectedText = "Login Successfully";
		String text = driver.findElement(By.xpath("//*[text()='Login Successfully']")).getText();
	  // Assert.assertEquals(text, expectedText, "Text does not matched");
		System.out.println(text);
	}
	@AfterTest
	public void teardown()
	{

     driver.quit();
	}
}
