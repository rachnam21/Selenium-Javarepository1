package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportTESTNGDemo {

	@BeforeSuite
	public void setUp(){
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentReports.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
	}
	@Test
	public void test1() throws Exception
	{
		ExtentTest test = extent.createTest("My first Test","Sample");
		test.log(Status.INFO,"Usage of log");
		test.info("shows info-details");
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("SS.png");
	}
	@AfterSuite
	public void Teardown(){
		extent.flush();
	}
}
