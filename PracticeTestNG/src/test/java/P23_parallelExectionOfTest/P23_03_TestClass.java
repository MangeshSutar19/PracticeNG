package P23_parallelExectionOfTest;

import org.testng.annotations.Test;

public class P23_03_TestClass {

	 @Test
	 public void testMethod9()
	 {
		 System.out.println("TestClass-03 >> TestMethod09 " +(Thread.currentThread().getId()));
	 }

	 @Test
	 public void testMethod10()
	 {
		 System.out.println("TestClass-03 >> TestMethod010 " +(Thread.currentThread().getId()));
	 }

	 @Test
	 public void testMethod11()
	 {
		 System.out.println("TestClass-03 >> TestMethod011 " +(Thread.currentThread().getId()));
	 }

	 @Test
	 public void testMethod12()
	 {
		 System.out.println("TestClass-03 >> TestMethod012 " +(Thread.currentThread().getId()));
	 }
}
