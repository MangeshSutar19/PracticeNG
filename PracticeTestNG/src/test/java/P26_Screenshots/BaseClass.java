package P26_Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeTest  
	public void browserLaunch()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new  FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		
	}
	@AfterTest
	public void tearDown()
	{
		 driver.quit();
	}
	@Test
	public static void takescreenshot() throws IOException
	{
		TakesScreenshot ts =  (TakesScreenshot)driver;
	    File file = 	 ts.getScreenshotAs(OutputType.FILE);
	    Files.copy(file, new File ("/home/mangeshs/eclipse-workspace/PracticeTestNG/screenshots/image-15Mar.jpg"));
	}
	
	@DataProvider (name = "xy")
	public Object[][] logindetails()
	{
		Object[][] data =new Object[2][2];
		data[0][0] = "abc";
		data[0][1] = "abc@123";
		
		data[1][0] = "abc";
		data[1][1] = "abc@123";
		
		return data;
	}


}