package P26_Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P26_01_BaseTest {
	
	public static WebDriver driver;
	Actions act ;
	public static String frmt2;
	
	@BeforeTest  
	public void setUp()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		act = new Actions(driver);
        
		
		
	}
	@AfterTest
	public void TearDown()
	{
		
		driver.quit();
	}
	public void captureScreenshots(String filename) 
	{
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now); 
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		frmt2 = now.format(format1);
		
        String folderPath = System.getProperty("/home/mangeshs/eclipse-workspace/PracticeTestNG/screenshots/") + "/" + frmt2;

		
	
		TakesScreenshot caputurescreeshots =  (TakesScreenshot) driver;
		File file = caputurescreeshots.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(file, new File ( folderPath+"/"+filename ));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screnshot Saved successfully");
		
	}
	
	


}
