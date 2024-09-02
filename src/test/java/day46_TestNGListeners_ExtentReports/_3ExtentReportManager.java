package day46_TestNGListeners_ExtentReports;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class _3ExtentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter; // UI of the report
	public ExtentReports extent; // Populate common info on the report
	public ExtentTest test; // creating test case entries in the report and update status of the test methods
	
	public void onStart(ITestContext context)
	{
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myReport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report"); // Title of report
		sparkReporter.config().setReportName("Functional Testing"); // Name of the report
		//sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Ramya");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser name", "Chrome");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getName());//Create a new entry in the report
		test.log(Status.PASS, "Test case PASSED is:" + result.getName());//update status P/F/S
	}

	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
		test.log(Status.FAIL, "Test case FAILED cause is:" + result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());
	}
	
	public void onFinish(ITestResult result)
	{
		extent.flush();
	}
}
