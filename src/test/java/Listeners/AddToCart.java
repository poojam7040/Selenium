package Listeners;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.listeners.BaseClassForDWS;

public class AddToCart extends BaseClassForDWS {

	  @Test
	  public void addToCart() {
		  
		  cd.findElement(By.partialLinkText("Digital downloads")).click() ;
		  
		  
	  }
}
