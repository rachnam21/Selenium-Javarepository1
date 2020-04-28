package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener{

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test completed" +context.getName());
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test failed"+context.getName());
	}
	

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test failed with success% "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test failed"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test skipped:: "+result.getName());
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test start"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test success"+result.getName());	
	}

}
