package InsertSCInExtentReport;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import CaptureScBaseCalss.BaseClassForCaptureSC;
@Listeners(ExtentReports.GenerateReport.class)
public class CaptureScOnFailedTestCase extends BaseClassForCaptureSC {

	
	@Test
	public void dwsLogin() throws InterruptedException
	{
	      cd.get("https://demowebshop.tricentis.com/") ;
	      
	      cd.findElement(By.className("ico-login")).click() ;
	      
	      cd.findElement(By.id("Email")).sendKeys("morepooja123@gmail.com") ;

	      Thread.sleep(2000) ;
	      
	      cd.findElement(By.id("Password")).sendKeys("Pooja123	") ;

	      cd.findElement(By.xpath("(//input[@type='submit'])[2]")).click() ;
	      
	      Thread.sleep(2000) ;
	      
	      
	      cd.findElement(By.xpath("//a[text()='Log out']")).click() ;

	}
	
	@Test
	public void dwsLogin1() throws InterruptedException
	{
	      cd.get("https://demowebshop.tricentis.com/") ;
	      
	      cd.findElement(By.className("ico-login")).click() ;
	      
	      cd.findElement(By.id("Email")).sendKeys("moreoja123@gmail.com") ;

	      Thread.sleep(2000);
	      
	      cd.findElement(By.id("Password")).sendKeys("Pooja") ;

	      cd.findElement(By.xpath("(//input[@type='submit'])[2]")).click() ;
	      assertEquals("ddfghi", "dfghj") ;
 	}
	
	
	@Test
	public void dwsLogin2() throws InterruptedException
	{
	      cd.get("https://demowebshop.tricentis.com/") ;
	      
	      cd.findElement(By.className("ico-lgin")).click() ;
	      
	      cd.findElement(By.id("Email")).sendKeys("morepooja123@gmail.com") ;

	      Thread.sleep(2000) ;
	      
	      cd.findElement(By.id("Password")).sendKeys("Pooja") ;

	      cd.findElement(By.xpath("(//input[@type='submit'])[2]")).click() ;
          
	}
	
}
