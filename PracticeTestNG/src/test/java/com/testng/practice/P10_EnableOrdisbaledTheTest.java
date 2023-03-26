package com.testng.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P10_EnableOrdisbaledTheTest {
	
	@Test
	public void TestGoogle()

	{
		
		WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        try {
    		
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Mangesh Sutar");
        act.sendKeys(Keys.ENTER).build().perform();
        System.out.println(driver.getTitle());
        
       	Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.close();
        
	}

	@Test
	public void TestFacebook()

	{
		
		WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        try {
    		
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("Mangesh Sutar", Keys.ENTER);
        System.out.println(driver.getTitle());        
       	Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.close();

	}
}


