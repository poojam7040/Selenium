package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterDws {


	@Test
	public void login () throws InterruptedException 
	{
		
		WebDriver cd = new ChromeDriver() ;
		
		cd.manage().window().maximize(); 
		
	    cd.get("https://demowebshop.tricentis.com/register") ;
	    
	    Register dws = new Register(cd) ;
	    
	    dws.gender();
	    
	    dws.firstName("Pooja") ;
	    
	    dws.lastName("More") ;
	    
	    dws.email("morepooja000@gmail.com") ;
	    
	    dws.password("Pooja!@#") ;
	    
	    dws.confirmPassword("Pooja!@#") ;
	    
	    dws.register_btn() ;
     }
}
