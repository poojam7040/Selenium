package com.crm.listeners;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClassForDWS {

	    public Properties property ;
	    
	    public FileInputStream file ;
		public WebDriver cd;
		@BeforeSuite
		public void beforeSuite()
		{
			System.out.println("BeforeSuite");
		}
		
	
		@BeforeClass
		public void launchBrowser() throws InterruptedException, IOException{
		      property = new Properties() ;

			  file = new FileInputStream("src\\test\\resources\\ConfigurationFile\\DWS.properties") ;
			  property.load(file);
		      String url = property.getProperty("url") ;
		 	  
		      cd = new ChromeDriver() ;  	
			  
			  cd.manage().window().maximize() ;
			
		      cd.get(url) ;
		      
			  cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;    
		}
		
		
		@BeforeMethod
		public void loginIntoDws() throws EncryptedDocumentException, IOException, InterruptedException
		{
		      String username = property.getProperty("username") ;
		      String password = property.getProperty("url") ;

	          cd.findElement(By.cssSelector("a[class='ico-login']")).click();
		      System.out.println("jh");
		      cd.findElement(By.id("Email")).sendKeys(username);
	
		      cd.findElement(By.id("Password")).sendKeys(password);
	
		      cd.findElement(By.cssSelector("input[value='Log in']")).click();
		
		}
		
//		@AfterMethod
//		public void afterMethod() throws InterruptedException
//		{
//			cd.findElement(By.xpath("//a[@class='ico-logout']")).click() ;
//		}
//		
//		
//		@AfterClass
//		public void afterClass() throws InterruptedException
//		{
//			Thread.sleep(2000);
//			
//			cd.close() ;
//			
//		}
}
