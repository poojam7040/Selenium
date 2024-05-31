package HelperMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {

	// THE invocationCount() METHOD IS USED WHEN WE WANT TO EXECUTE SAME METHOD FOR SPECIFIED TIMES (TIMES WHICH WE PASS
	// TO THAT METHOD )
	
	@Test()
	public void fireboltt() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.fireboltt.com/");
		driver.close();
		
	}
	
	
	@Test(priority = 4,invocationCount = -2)
	public void noise() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.gonoise.com/");
		driver.close();
		
	}

	
}
