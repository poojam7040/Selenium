package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddToCart {

	@Test
	public void login () throws InterruptedException 
	{
		WebDriver cd = new ChromeDriver() ;
		
		cd.manage().window().maximize(); 
		
	    cd.get("https://demowebshop.tricentis.com/digital-downloads") ;
	    
	    AddToCartPom dws = new AddToCartPom(cd) ;
	    
	    List<WebElement> addTocart = dws.addToCart() ;
	  
	    for(WebElement ele : addTocart) {
	    	ele.click( ) ;
	    	
	    	Thread.sleep(2000) ;
	    }
																																	
	    
	    
	}
}
