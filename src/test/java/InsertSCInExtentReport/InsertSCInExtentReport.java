package InsertSCInExtentReport;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import CaptureScBaseCalss.BaseClassForCaptureSC;

public class InsertSCInExtentReport extends BaseClassForCaptureSC implements  ITestListener  {

	ExtentReports report ;
	ExtentSparkReporter sp ;
	ExtentTest t1 ;
	
	@Override
	public void onTestStart(ITestResult result) {
		
		String name = result.getMethod().getMethodName() ;
		t1=report.createTest(name) ;
		t1.log(Status.INFO,"Welcome To website") ;
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		t1.log(Status.PASS,"Test Case passed") ;

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		String name = result.getMethod().getMethodName() ;
	    t1.log(Status.FAIL, name+ " Failed due to wrong credentials") ;
      
	    TakesScreenshot sc = (TakesScreenshot) cd ;
	    String sc_file = sc.getScreenshotAs(OutputType.BASE64) ;
	    t1.addScreenCaptureFromBase64String(sc_file) ;
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
		
		File file = new File("./ExtentReports/DwsReportWithSC.html")  ;
		
		ExtentSparkReporter sp = new ExtentSparkReporter(file) ;
		
		sp.config().setDocumentTitle("DWS REPORT") ;
		
		sp.config().setReportName("POOJA") ;
		
		report.setSystemInfo("OS","Windows-10") ;
		
		sp.config().setTheme(Theme.STANDARD) ;
		
		report.attachReporter(sp) ;
	
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush(); 
		System.out.println("ON FINISH");
	}

}
