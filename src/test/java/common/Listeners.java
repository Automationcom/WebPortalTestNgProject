package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test case is Starting");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is Starting");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed, Screenshot captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is Starting");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test case is Starting");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test case is Starting");	}

	public void onStart(ITestContext context) {
		System.out.println("Test case is Starting");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test case is Starting");
	}

	
	
	
	
	
	

}
