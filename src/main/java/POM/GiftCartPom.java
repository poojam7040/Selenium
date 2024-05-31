package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCartPom {

		
		private @FindBy(className="recipient-name")
		WebElement rName ;
		
	   private @FindBy(className = "recipient-email")
	   WebElement rEmail ;
	
	   
	   private @FindBy(className = "sender-name")
	   WebElement senderName ;
	   
	   private @FindBy(className = "sender-email")
	   WebElement senderEmail ;
	   
	   private @FindBy(className = "message")
	   WebElement message ;

	   
	   private @FindBy(className = "qty-input")
	   WebElement quantity ;
	   
	   private @FindBy(xpath = "(//input[@type='button'])[2]")
	   WebElement addToCart ;

			
	   
			   
		public GiftCartPom(WebDriver cd) {

			PageFactory.initElements(cd,this);
		}
		
		public void rName(String rName)
		{
			this.rName.sendKeys("Niharika");;
		}
		
		public void rEmail(String rEmail)
		{
			this.rEmail.sendKeys(rEmail);
		}
		
		public void senderName(String senderName)
		{
			this.senderName.sendKeys(senderName);
		}
		
		
		public void senderEmail(String senderEmail)
		{
			this.senderEmail.sendKeys(senderEmail); ;
		}
		
		public void message(String message)
		{
			this.message.sendKeys(message); ;
		}
		
		public void quantity(String quantity)
		{
			this.quantity.clear();
			this.quantity.sendKeys(quantity);
		}
		
		
		public void addToCart()
		{
			this.addToCart.click();
		}
}
