package P23_parallelExectionOfTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class P23_02_TestClass {

	 @Test
	 public void testMethod5()
	 {
		 System.out.println("TestClass-02 >> TestMethod05 " +(Thread.currentThread().getId()));
	 }

	 @Test
	 public void testMethod6()
	 {
		 System.out.println("TestClass-02 >> TestMethod06 " +(Thread.currentThread().getId()));
	 }

	 @Test
	 public void testMethod7()
	 {
		 System.out.println("TestClass-02 >> TestMethod07 " +(Thread.currentThread().getId()));
	 }

	 @Test
	 public void testMethod8()
	 {
		 System.out.println("TestClass-02 >> TestMethod08 " +(Thread.currentThread().getId()));
	 }
}
