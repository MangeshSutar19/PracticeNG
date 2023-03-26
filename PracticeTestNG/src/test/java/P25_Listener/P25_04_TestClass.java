package P25_Listener;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners({P25_03_ITestListenerClass.class})
public class P25_04_TestClass {

	 @Test
	 public void testMethod1()
	 {
		 System.out.println("TestClass-01 >> TestMethod01 " +(Thread.currentThread().getId()));
		 
		 AssertJUnit.assertTrue(false);
	 }
 
	 @Test(timeOut= 1000)
	 public void testMethod2() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 System.out.println("TestClass-01 >> TestMethod02 " +(Thread.currentThread().getId()));
	 }

	 @Test
	 public void testMethod3()
	 
	 {
		 System.out.println(5/0);

		 System.out.println("TestClass-01 >> TestMethod03 " +(Thread.currentThread().getId()));
	 }

	 @Test(dependsOnMethods = "testMethod3")
	 public void testMethod4()
	 {
		 System.out.println("TestClass-01 >> TestMethod04 " +(Thread.currentThread().getId()));
	 }
}
