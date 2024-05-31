package Feature.travel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTrip {

	@Test(groups = "smoke")
	public void makeMyTrip()
	{
		WebDriver cd = new ChromeDriver() ;
		
		cd.get("https://www.makemytrip.com/") ;
		
	
		
	}
}
