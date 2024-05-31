package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddProductToCart extends BaseClass{

	
	@Test
	
	public void addProduct () throws InterruptedException {
		
		cd.findElement(By.partialLinkText("Digital downloads")).click() ;
		
		List<WebElement> addToCart = cd.findElements(By.cssSelector("input[value='Add to cart']")) ;
		
  
		for(WebElement web : addToCart)
		{
			web.click();
			
			Thread.sleep(2000) ;
		}
		
	}
	
}
