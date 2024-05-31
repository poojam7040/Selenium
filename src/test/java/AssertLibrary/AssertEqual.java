package AssertLibrary;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import parameter.BaseClassForDWs;


public class AssertEqual extends BaseClassForDWs{

	
	@Test
	public void dws() {
	String expected_Url = "https://demowebshop.tricentis.com/" ;
//	WebDriver  cd = new ChromeDriver() ;  	
//	  
//	cd.manage().window().maximize() ;
//	
//    cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;  
//
//    cd.get("https://demowebshop.tricentis.com/") ;
    
    String actual_Url = cd.getCurrentUrl() ;
    
    assertEquals(expected_Url, actual_Url) ;
	
	cd.findElement(By.id("small-searchterms")).sendKeys("Tiger") ;
	
	cd.findElement(By.cssSelector("input[type='submit']")).click();

	
	
	}
}
