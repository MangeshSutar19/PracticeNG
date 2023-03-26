package P26_Screenshots;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test()
public class BTestMethods extends BaseClass{

	@Test(dataProvider = "xy", dataProviderClass= BaseClass.class)
	public void testlogin(String username , String pwd)
	{
		//
		//
		    driver.get("https://demo.guru99.com/test/newtours/index.php");
	        driver.findElement(By.name("userName")).sendKeys(username);
	        driver.findElement(By.name("password")).sendKeys(pwd);
	        driver.findElement(By.name("submit")).click();
	        System.out.println(5/0);
	        
	   	
	}

}
