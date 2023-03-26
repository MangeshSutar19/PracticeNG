package com.testng.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P9_optionalParameter {

	WebDriver driver;
	@Parameters ("browserName")
	@BeforeTest
	public void OpenBroswer(@Optional("chrome") String browserName)
	{
		switch(browserName.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break ;
		case "firfox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();    
			break ;

		default:
			System.out.println("Broswer is invalid");	
			break;


		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	} 
	@Parameters ("ulrinput")
	@Test
	public void launchApp(@Optional ("https://demo.guru99.com/test/newtours/index.php") String ulrinput)
	{
		driver.get(ulrinput);
	}

	@Parameters ({"username" , "password"})
	@Test
	public void logindetails(@Optional("abc") String username ,@Optional("abc@123") String password) throws InterruptedException
	{

		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);

	}
	@Test
	public void UserLoggedIN() throws Exception
	{
		String UserLoggedIN = driver.findElement(By.xpath("//*[text()='Login Successfully']")).getText();

		System.out.println(UserLoggedIN);
	}
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}



}
