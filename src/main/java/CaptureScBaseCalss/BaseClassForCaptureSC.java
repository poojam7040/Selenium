package CaptureScBaseCalss;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassForCaptureSC {

	public static  WebDriver cd ;
	
	@BeforeClass
	public void launch(){
		
	    cd = new ChromeDriver() ;
	    
		cd.manage().window().maximize() ;
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
		
	}
	
	@AfterClass
	public void close(){
		
		cd.close() ;
	}
	
	@BeforeMethod
	public void beforeMethod(){
		
		System.out.println("Before method");
	}

	
	@AfterMethod
	public void afterMethod(){
		
		System.out.println("After method");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
