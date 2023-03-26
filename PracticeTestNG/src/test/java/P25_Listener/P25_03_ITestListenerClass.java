package P25_Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class P25_03_ITestListenerClass implements ITestListener{ //we are not getting any error because java 8.0/9.0 allowed to define 


	
	@Override 
	  public  void onTestStart(ITestResult result) {
	     // not implemented
		System.out.println("onTestStart");
	   }

	   @Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);

			System.out.println("onTestSuccess");

	   }
	   

	@Override 
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		
		System.out.println("onTestFailure");

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);

		System.out.println("onTestSkipped");

	
	}

	

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

		System.out.println("onTestFailedWithTimeout");

		//	ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

		System.out.println("onStart");

		//ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFinish");

		//ITestListener.super.onFinish(context);
	}


} 
