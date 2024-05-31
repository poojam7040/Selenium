package HelperMethods;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperMethod {

	//IF PRIORITY IS SAME THEN IT WILL EXCUTE SAME PRIORITY METHODS ACCORDING TO ASCII VALUE .
	//Priority start from 0
	//Default priority is 0 
	//max priority is not fixed
	//negative priority is executed  first 
	
	@Test()
	public void fireboltt() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.fireboltt.com/");
		driver.close();
		
	}
	
	
	@Test(priority = 4)
	public void noise() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.gonoise.com/");
		driver.close();
		
	}

	@Test(priority = -0)
	public void fastrack() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.fastrack.in/");
		driver.close();
		
	}
//	
//	@Test(priority = 2)
//	public void boat() {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.navigate().to("https://www.boat-lifestyle.com//");
//		driver.close();
//		
//	}
//
//	@Test(priority = 1)
//	public void titan() {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.navigate().to("https://www.titan.co.in/");
//		driver.close();
//		
//	}	
}