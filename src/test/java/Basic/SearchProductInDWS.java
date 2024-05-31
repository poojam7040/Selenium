package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchProductInDWS  extends BaseClass {

	
	@Test
	public void searchProduct ()
	{
		cd.findElement(By.id("small-searchterms")).sendKeys("Watch",Keys.ENTER);
	}
}
