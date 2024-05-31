package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	WebDriver cd ;
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeClass
	public void launchBrowser(){
		
	    cd = new ChromeDriver() ;
		
		cd.get("https://demowebshop.tricentis.com/") ;
		
		cd.manage().window().maximize() ;
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
		
	}
	
	@BeforeMethod
	public void loginIntoDWS()
	{
		cd.findElement(By.cssSelector("a[class='ico-login']")).click() ;
		
		cd.findElement(By.id("Email")).sendKeys("morepooja123@gmail.com"); 
		
		cd.findElement(By.id("Password")).sendKeys("Pooja123");
		
		cd.findElement(By.cssSelector("input[value='Log in']")).click() ;

	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		cd.findElement(By.cssSelector("a[class='ico-logout']")).click() ;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		Thread.sleep(2000);
		
		cd.close() ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
