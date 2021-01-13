package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNg {

	

	static ExtentReports extent;

	public static ExtentReports getreport() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web automation");
		reporter.config().setDocumentTitle("Test result");

		extent = new ExtentReports();                     
		extent.attachReporter(reporter);

		extent.setSystemInfo("Tester", "Vipul");
		return extent;
	}

	
}

