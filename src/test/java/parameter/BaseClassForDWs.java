package parameter;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClassForDWs {

	public WebDriver cd;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@Parameters("url")
	@BeforeClass
	public void launchBrowser(String url) throws InterruptedException{
		
	 	  cd = new ChromeDriver() ;  	
		  
		  cd.manage().window().maximize() ;
		
	      cd.get(url) ;
	      
		  cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;    
	}
	
//	@Parameters({"username","pass"})
//	@BeforeMethod
//	public void loginIntoDws(String username , String pass) throws EncryptedDocumentException, IOException, InterruptedException
//	{
//	     
//          cd.findElement(By.cssSelector("a[class='ico-login']")).click();
//	      System.out.println("jh");
//	      cd.findElement(By.id("Email")).sendKeys(username);
//
//	      cd.findElement(By.id("Password")) .sendKeys(pass);
//
//	      cd.findElement(By.cssSelector("input[value='Log in']")) .click();
//	
//	}
	
//	@AfterMethod
//	public void afterMethod() throws InterruptedException
//	{
//		cd.findElement(By.xpath("//a[@class='ico-logout']")).click() ;
//	}
	
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		Thread.sleep(2000);
		
		cd.close() ;
		
	}
	
	
	
       
       
	}
