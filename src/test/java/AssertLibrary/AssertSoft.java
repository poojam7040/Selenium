package AssertLibrary;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSoft {

	
	@Test
	public void dws() {
		
	SoftAssert ac = new SoftAssert() ;
	
	String expected_Url = "https://demowebshop.tricentis.com/" ;
	WebDriver  cd = new ChromeDriver() ;  	
	  
	cd.manage().window().maximize() ;
	
	String str1 =  null  ;
	
	String str2 = "Pooja" ;
	
	ac.assertNull(str2);
	
//	assertNotNull(str2);
	
    cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;  

    cd.get("https://demowebshop.tricentis.com/") ;
    
    String actual_Url = cd.getCurrentUrl() ;
    
    assertEquals(expected_Url, actual_Url) ;
	
	cd.findElement(By.id("small-searchterms")).sendKeys("Tiger") ;
	
	cd.findElement(By.cssSelector("input[type='submit']")).click();

	//this method gives u why assert method is failed
	
//	ac.assertAll() ;
	
	
	}
	
}
