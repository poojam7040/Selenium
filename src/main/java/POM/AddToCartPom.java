package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPom {
	//input[@value='Add to cart']
	
	private @FindBys(value=@FindBy(xpath="//input[@value='Add to cart']"))
	List<WebElement> addToCart ;
	
	private @FindBy(id="products-orderby")
	WebElement productOrderBy ;

	private @FindBy(id="products-pagesize")
	WebElement productSize ;
	 	
	private @FindBy(id="products-viewmode")
	WebElement productViewMode;
	
	
	public AddToCartPom(WebDriver cd) {
      
		PageFactory.initElements(cd,this);

	}

	
	public List<WebElement> addToCart() {
		
		List<WebElement> ele = this.addToCart ;

		
		return ele ;
		
	}
    
	
   public void productSize() {
		
		Select select = new Select((WebElement) productSize) ;
		
		List<WebElement> opt = select.getOptions() ;
		
		for(WebElement ele : opt)
		{
			ele.click(); 	
		}
	}
   
   
   public void productViewMode() {
		
		Select select = new Select(productViewMode) ;
		
		List<WebElement> opt = select.getOptions() ;
		
		for(WebElement ele : opt)
		{
			ele.click(); 
		}
		
		
	}
   
   public void productOrderBy() {
		
		Select select = new Select(productOrderBy) ;
		
		List<WebElement> opt = select.getOptions() ;
		
		for(WebElement ele : opt)
		{
			ele.click(); 
			
			
		}
		
		
	}
    
	
	
	
}
