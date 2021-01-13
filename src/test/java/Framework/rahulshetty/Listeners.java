package Framework.rahulshetty;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import resources.ExtentReportNg;

public final class Listeners implements ITestListener {
	
	public ExtentTest test;
	ExtentReports report=ExtentReportNg.getreport();
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		report.flush();
		
	}
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onTestStart(ITestResult result) {
	test=	report.createTest(result.getMethod().getMethodName());
		
	}
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	

}