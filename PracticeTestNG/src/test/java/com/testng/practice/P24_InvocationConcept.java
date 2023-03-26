package com.testng.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P24_InvocationConcept {

	@Test(invocationCount= 4 , invocationTimeOut  = 10000, threadPoolSize = 2)
	public void takeUserdetails() throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://randomuser.me/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		System.out.println("User name: " + driver.findElement(By.id("user_value")).getText());

		driver.findElement(By.xpath("//li[@data-label='email']")).click();
		System.out.println("Email address: " + driver.findElement(By.id("user_value")).getText());
		driver.quit();		
	}
	
}
