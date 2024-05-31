package IretryInt;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class RetryinOfScriptWhenItFailToSuccess {

	@Test(retryAnalyzer = IretryInt.Retry.class)
	public void execute()
	{
	   WebDriver cd = new ChromeDriver() ;
	   assertEquals("jxj", "jejcje");
	   
	}
}
