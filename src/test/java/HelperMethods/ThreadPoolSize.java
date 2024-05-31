package HelperMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSize {

	
	@Test(priority = 2)
	public void fireboltt() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.fireboltt.com/");
		driver.close();
		
	}
	
	
	@Test(priority = 1,invocationCount = 2,threadPoolSize = 2)
	public void noise() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.gonoise.com/");
		driver.close();
	
	}
	
	@Test(priority = 0)
	public void titan() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.titan.co.in/");
		driver.close();
		
	}	
}
