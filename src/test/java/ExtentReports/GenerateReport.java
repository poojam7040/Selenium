package ExtentReports;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateReport implements ITestListener{

	ExtentReports report ;
	ExtentSparkReporter sp ;
	ExtentTest t1 ;
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName() ;
		
		t1=report.createTest(name) ;
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		String name = result.getMethod().getMethodName() ;
	    t1.log(Status.FAIL, name+ " Failed due to wrong credentials") ;


	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
		String name = result.getMethod().getMethodName() ;
	    t1.log(Status.FAIL, name+ " skipped due to wrong credentials") ;

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("ON START");
		
        report = new ExtentReports() ;
		
		File file = new File("./ExtentReports/DwsReport2.html")  ;
		
		ExtentSparkReporter sp = new ExtentSparkReporter(file) ;
		
		sp.config().setDocumentTitle("DWS REPORT") ;
		
		sp.config().setReportName("POOJA") ;
		
		sp.config().setTheme(Theme.STANDARD) ;
		
		report.attachReporter(sp) ;
		

	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush(); 
		System.out.println("ON FINISH");
	}

		
}
	