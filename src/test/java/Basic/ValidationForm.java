package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidationForm {
	
	    WebDriver cd ;
	    @BeforeMethod
        public void beforeLauch() {	
        	
		cd = new ChromeDriver() ;
		
		cd.get("https://demoapps.qspiders.com/ui/formValidation");
		
		cd.manage().window().maximize() ;
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ;
		
        }
		
	    @Test
        public void execute() throws InterruptedException {	

		Thread.sleep(2000) ;
		cd.findElement(By.cssSelector("input[name='requiredfield']")).sendKeys("Something") ;
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='password']")).sendKeys("watch");
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='confirmpass']")).sendKeys("watch");
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='email']")).sendKeys("morepooja7040");
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='url']")).sendKeys("https://demoapps.qspiders.com/");
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='digits']")).sendKeys("1234556677");
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='number']")).sendKeys("897688");
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='alphanum']")).sendKeys("ABGVFD897688");
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='minLength']")).sendKeys("894448");
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='maxLength']")).sendKeys("897688");
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='rangeLength']")).sendKeys("897688777");
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='minValue']")).sendKeys("897688777");
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='maxValue']")).sendKeys("897688777");
		Thread.sleep(2000) ;

		cd.findElement(By.cssSelector("input[name='rangeValue']")).sendKeys("007688773456787");

	    }
    	
	    @AfterMethod
	    public void closeBrowser() throws InterruptedException
	    {
	       Thread.sleep(2000) ;
	    	
	       cd.close() ;	
	    }

	}


