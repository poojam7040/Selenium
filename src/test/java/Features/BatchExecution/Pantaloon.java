package Features.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pantaloon {

	@Test(groups = "smoke")
	public void pantaloons()
	{
		WebDriver cd = new ChromeDriver() ;
		
		cd.get("https://www.pantaloons.com/") ;
	
		cd.close() ;
	}
	
}
