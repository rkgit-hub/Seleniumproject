package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter sparkReporter; // will maintaining UI of the reports
	public ExtentReports extent;		// Populate the common info of the reports
	public ExtentTest test;		// creating test case entries in the report & update status of the Test Methods
	
	public void onStart(ITestContext context)
	{
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReports.html");
								// specifying  of the report
		
		sparkReporter.config().setDocumentTitle("Automation");	// Setting Title of the report
		sparkReporter.config().setReportName("Functional Testing");	// Setting Name of the report
		sparkReporter.config().setTheme(Theme.STANDARD);	//setting background theme to report
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter); // this will combine the all classes related info in the report
		
		extent.setSystemInfo("ComputerName","LocalHost"); // Information about the total system
		extent.setSystemInfo("Enviroment","QA");
		extent.setSystemInfo("TesterName","Ram");
		extent.setSystemInfo("OS","Windows11");
		extent.setSystemInfo("Browser","Chrome");	
	}
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getName());	// creating a new entry in the report
		test.log(Status.PASS,"Test case PASSED is:"+result.getName());	// update the status pass/fail/skipped
	}
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getName());	// creating a new entry in the report
		test.log(Status.FAIL,"Test case FAILED is:"+result.getName());	// update the status fail
		test.log(Status.FAIL,"Test case FAILED is:"+result.getThrowable()); // cause of the test fail
	}
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());	// creating a new entry in the report
		test.log(Status.SKIP,"Test case FAILED is:"+result.getName());	// update the status skipped
	}
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}

}
