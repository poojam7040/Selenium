package CaptureScBaseCalss;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CaptureSC extends BaseClassForCaptureSC implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
        
		LocalDateTime dt = LocalDateTime.now() ;
		
		String tm = dt.toString().replace(":", "-") ;
		
		TakesScreenshot sc = (TakesScreenshot) cd ;
		
		File file = sc.getScreenshotAs(OutputType.FILE) ;
		
		File   to = new File("./ScreenShot/"+tm+".png") ;
		
		try {
			FileHandler.copy(file, to) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
