package P26_Screenshots;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class P26_03_ITestListenerClass extends  P26_01_BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println(result.getMethod().getMethodName());
		captureScreenshots(result.getMethod().getMethodName()+".jpg");
	}
	

}
