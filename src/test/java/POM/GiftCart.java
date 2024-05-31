package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GiftCart {

	
	@Test
	public void login () throws InterruptedException 
	{
		
		WebDriver cd = new ChromeDriver() ;
		
		cd.manage().window().maximize(); 
		
	    cd.get("https://demowebshop.tricentis.com/5-virtual-gift-card") ;
	    
	    GiftCartPom dws = new GiftCartPom(cd) ;
	    
	    dws.rName("Ruhi") ;
	    
	    dws.rEmail("ruhi23@gmai.com") ;
	    
	    dws.senderName("Pooja") ;
	    
	    dws.senderEmail("morepooja000@gmail.com") ;
	    
	    dws.message("Hi i am pooja ") ;
	    
	    dws.quantity("5") ;
	    dws.addToCart() ;
	    
	    
	  
     }
}
