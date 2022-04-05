package Util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("******** Test Started *********: "+ result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("******** Test is Successful *********: "+ result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("******** Test failure *********: "+ result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("******** Test Skipped *********: "+result.getName());
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("******** Test Completed *********: "+ context.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("******** Test Failed but with success percent of:- *********: "+result.getName());

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("******** Test Failed With Timeout   *********: "+result.getName());
	}
	

}
