package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver cd = new ChromeDriver() ;
			
			cd.get("https://www.shoppersstack.com/") ;
			
			cd.manage().window().maximize() ;
			
			cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;

			cd.findElement(By.id("loginBtn")) .click();
			
			   cd.findElement(By.id("Email")).sendKeys("morepooja7040@gmail.com");

			    cd.findElement(By.id("Password")) .sendKeys("Pooja@7040");
			      
			    cd.findElement(By.xpath("//span[text()='Login']")).click();
			
			
			       Actions ac = new Actions(cd);
			       
				      JavascriptExecutor js = (JavascriptExecutor) cd ;

				      js.executeScript("window.scrollBy(3000,0)") ;//Horizontal scrolling  left to right
			     // men = cd.findElement(By.xpath("//a[text()='Men']")) ;
			       
			 //      ac.moveToElement(men) ;
			       
			       WebElement tshirts = cd.findElement(By.xpath("//a[text()='T-shirts']")) ;

			       ac.click(tshirts) ;
			       
			       List<WebElement> addToCart = cd.findElements(By.linkText("//button[text()='add to cart']")) ;
			       
			       for (WebElement web : addToCart) 
			       {
					
			    	   System.out.println("djdjhwjkd");
			    	   web.click() ;
			    	   
			    	   Thread.sleep(2000) ;
				   }
			       
			    
			    		 
			       
			       
				}
			
			
			
			
			
			
			
	}
