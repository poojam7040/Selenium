package Features.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {

	@Test(groups ="integration")
	public void ajio()
	{
		WebDriver cd = new ChromeDriver() ;
		
		cd.get("https://www.ajio.com/") ;
		
		cd.close() ;

		
	}
	
}
