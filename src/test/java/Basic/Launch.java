package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
	
	@Test
	public void wexecute() throws InterruptedException {
		
		WebDriver cd =  new ChromeDriver() ;
		
		cd.manage().window().maximize(); 
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
		
		cd.get("https://demowebshop.tricentis.com/") ;
		
		Thread.sleep(2000) ;
		
		cd.close() ;
		
	}
	
	@Test(priority = 0)
	public void launchPantaloon() throws InterruptedException {
		
		WebDriver cd =  new ChromeDriver() ;
		
		cd.manage().window().maximize(); 
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
		
		cd.get("https://www.pantaloons.com/") ;
		
		Thread.sleep(2000) ;
		
		cd.close() ;
		
	}
	
	
//	@Test(priority = 2)
//	public void launchNurserylive() throws InterruptedException {
//		
//		WebDriver cd =  new ChromeDriver() ;
//		
//		cd.manage().window().maximize(); 
//		
//		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
//		
//		cd.get("https://nurserylive.com/") ;
//		
//		Thread.sleep(2000) ;
//		
//		cd.close() ;
//		
//	}
	
	

}
