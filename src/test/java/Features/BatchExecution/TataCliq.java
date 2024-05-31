package Features.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TataCliq {

	
	@Test(groups = "integration")
	public void tataCliq()
	{
		WebDriver cd = new ChromeDriver() ;
		
		cd.get("https://www.tatacliq.com/") ;
		
		cd.close() ;

		
	}
}
