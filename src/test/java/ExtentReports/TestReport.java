package ExtentReports;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestReport {

	@Test
	public void testReport()
	{
		ExtentReports report = new ExtentReports() ;
		
		File file = new File("./ExtentReports/TestReort.html")  ;
		
		ExtentSparkReporter sp = new ExtentSparkReporter(file) ;
		
		sp.config().setDocumentTitle("TEST REPORT") ;
		
		sp.config().setReportName("POOJA") ;
		
		sp.config().setTheme(Theme.STANDARD) ;
		
		report.attachReporter(sp) ;
		
		ExtentTest t1 = report.createTest("Test1") ;
		
		t1.log(Status.FAIL, "Login button is not working") ;
		
		report.flush() ;
		
		
		
		
		
		
	}
}
