package com.testng.practice;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P5_AssertionTestNG {

	@Test
	public static void launchbrowserAndVerifyTitle()
	{
        String ExpectedTitle = "Basic Controls - H Y R Tutorials";
        String ActualTitle ;
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	    ActualTitle = driver.getTitle();
	    assertEquals(ActualTitle, ExpectedTitle , "Title does not  matached");
	    driver.close();
	    		
	}

}
