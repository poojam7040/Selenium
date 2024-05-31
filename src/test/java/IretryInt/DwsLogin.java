package IretryInt;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Listeners.DataProviderUtility;

public class DwsLogin {

	
	 @Test(dataProvider = "login",retryAnalyzer = com.crm.listeners.ListenersRetry.class)
	  public void loginDWS(String username,String pass)
	  {
		  
		  WebDriver cd = new ChromeDriver() ;  	
		  
		  cd.manage().window().maximize() ;
		
	      cd.get("https://demowebshop.tricentis.com/") ;
	      
	      cd.findElement(By.cssSelector("a[class='ico-login']")) .click();
	      
	      cd.findElement(By.id("Email")).sendKeys(username);

	      cd.findElement(By.id("Password")) .sendKeys(pass);

	      cd.findElement(By.cssSelector("input[value='Log in']")) .click();
		  
	      cd.close() ;
	  }
	  
	  
	  
	  @DataProvider(name = "login")
     Object[] [] sender() throws EncryptedDocumentException, IOException
	  {
		  return  DataProviderUtility.dwsLogin() ;
	  }
}
