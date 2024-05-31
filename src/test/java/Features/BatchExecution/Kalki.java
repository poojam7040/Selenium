package Features.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kalki {

	@Test(groups = "integration")
	public void kalki()
	{
		WebDriver cd = new ChromeDriver() ;
		
		cd.get("https://www.kalkifashion.com/") ;
		
		cd.close() ;

		
	}
}
