package parameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {

	//berfore adding parameters annotation we should create xml file then only it will create with proper classes 
	//otherwise it wont create .
	//we have to run xml file
	@Parameters({"url","username","password"})
	@Test
	public void shoppersStackLogin(String url , String username ,String password) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to(url);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40)) ;
		WebElement loginBtn = driver.findElement(By.id("loginBtn")) ;
		
		if(loginBtn.isEnabled())
		{
			loginBtn.click() ;
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath("span[text()='Login']")).click();
		}
		driver.close();
		
	}
}	
