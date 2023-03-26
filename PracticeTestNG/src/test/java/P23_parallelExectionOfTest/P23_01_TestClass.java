package P23_parallelExectionOfTest;

import org.testng.annotations.Test;

public class P23_01_TestClass {

	 @Test
	 public void testMethod1()
	 {
		 System.out.println("TestClass-01 >> TestMethod01 " +(Thread.currentThread().getId()));
	 }

	 @Test
	 public void testMethod2()
	 {
		 System.out.println("TestClass-01 >> TestMethod02 " +(Thread.currentThread().getId()));
	 }

	 @Test
	 public void testMethod3()
	 {
		 System.out.println("TestClass-01 >> TestMethod03 " +(Thread.currentThread().getId()));
	 }

	 @Test
	 public void testMethod4()
	 {
		 System.out.println("TestClass-01 >> TestMethod04 " +(Thread.currentThread().getId()));
	 }
}
