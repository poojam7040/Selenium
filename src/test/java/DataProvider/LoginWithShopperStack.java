package DataProvider;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithShopperStack {

	
	 @Test(dataProvider = "LOGIN")
	  public void loginDWS(String username,String pass)
	  {
		  
		  WebDriver cd = new ChromeDriver() ;  	
		  
		  cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
		  
		  cd.manage().window().maximize() ;
		
	      cd.get("https://www.shoppersstack.com/") ;
	      
	      cd.findElement(By.id("loginBtn")) .click();
	      
	      cd.findElement(By.id("Email")).sendKeys(username);

	      cd.findElement(By.id("Password")) .sendKeys(pass);
	      
	      cd.findElement(By.xpath("//span[text()='Login']")).click();
	      
	    
	      
	     // cd.close() ;
	  }
	 
	 @DataProvider(name="LOGIN")
	 public static Object[] [] sender() throws EncryptedDocumentException, IOException
	  {
		  
		//  return UtilityClass.shopperStackLogin();
		 
		 return DataProviderUtility.shopperStackLogin() ;
	  }
	 
}

