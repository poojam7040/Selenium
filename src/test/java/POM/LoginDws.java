package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginDws {

	@Test
	public void login () throws InterruptedException {
		
		WebDriver cd = new ChromeDriver() ;
		
		cd.manage().window().maximize(); 
		
	    cd.get("https://demowebshop.tricentis.com/login") ;
	    
	    DwsLogin dws = new DwsLogin(cd) ;
	    
//	    dws.username.sendKeys("morepooja123@gmail.com") ;
//	    
//	    Thread.sleep(2000) ;
//	    
//	    dws.password.sendKeys("Pooja@123");
//	    
//	    Thread.sleep(2000) ;
//
//	    dws.login_btn.click() ;
	    
	    dws.username("morepooja000@gmail.com") ;
	    
	    dws.password("Pooja!@#") ;
	    
	    dws.login();
	    
	    
	    
	    

		
	}
}
