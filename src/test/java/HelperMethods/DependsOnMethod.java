package HelperMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {

	//ALL METHODS WILL EXECUTE ACCORDING TO PRIORITY ONLY 
	// SO ACCORING TO PRIORITY DELETE FIRST STAR EXECUTION BUT AS IT IS DEPEND ON CREATEACC IT WILL GO TO WAIT STATE AND 
	// THEN createAccount() METHOD WILL EXECUTE AND THEN DELTE ACC WILL EXECUTE 
	
	
	    @Test(priority = 3)
		public void createAccount() {
				
	      System.out.println("Account created");
			
		}
	    
	    @Test()
		public void remove() {
				
	      System.out.println("Removed");
			
		}
	    
	    
	    @Test(dependsOnMethods = "createAccount",priority = 1)
		public void modifyAcc() {
				
	      System.out.println("Account is modified");
	      
		}
		
	    @Test(priority = 0,dependsOnMethods = "createAccount")
		public void deleteAccount() {
				
	      System.out.println("Account is deleted");
			
		}
		
		
		
		
		
		
	}
