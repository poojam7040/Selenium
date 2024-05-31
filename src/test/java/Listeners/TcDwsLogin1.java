package Listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.listeners.DwsLogin.class)
public class TcDwsLogin1 {

	WebDriver cd ;
	 
	@Test
    public void dwsLogin(){
		
	    cd = new ChromeDriver() ;
		
		cd.get("https://demowebshop.tricentis.com/") ;
		
		cd.manage().window().maximize() ;
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
		
		cd.findElement(By.cssSelector("a[class='ico-login']")).click() ;
		
		cd.findElement(By.id("Email")).sendKeys("morepooja123@gmail.com"); 
		
		cd.findElement(By.id("Password")).sendKeys("Pooja123");
		
		cd.findElement(By.cssSelector("input[value='Llog in']")).click() ;
	}
	
	
	   @Test
       public void ajio(){
		
		    cd = new ChromeDriver() ;
			
			cd.get("https://demowebshop.tricentis.com/") ;
			
			cd.manage().window().maximize() ;
		
       }
       
	   @Test(dependsOnMethods = "dwsLogin")
       public void pantaloon(){
   		
	   	    cd = new ChromeDriver() ;
	   		
	   		cd.get("https://demowebshop.tricentis.com/") ;
	   		
	   		cd.manage().window().maximize() ;
   		
        }
       
       
	
}
