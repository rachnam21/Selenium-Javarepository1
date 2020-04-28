package Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentReports.html");

ExtentReports extent = new ExtentReports();
extent.attachReporter(htmlreporter);
	}

}
