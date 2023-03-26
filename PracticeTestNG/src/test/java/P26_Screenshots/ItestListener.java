package P26_Screenshots;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListener extends BaseClass implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {

		try {
			System.out.println(result.getMethod().getMethodName());

			takescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
		try {
			System.out.println(result.getMethod().getMethodName());

			takescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
