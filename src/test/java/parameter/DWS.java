package parameter;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS extends BaseClassForDWs {

	
	@Test
	public void openWebsites() throws InterruptedException
	{

        List<WebElement> websites = cd.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a")) ;
        
       
        for(WebElement web : websites)
        {
        	
        	web.click() ;
        	System.out.println(web);
        	Thread.sleep(2000) ;
        	String st = cd.getCurrentUrl() ;
        	//System.out.println(st);
 
        	if(st.equals("https://demowebshop.tricentis.com/news/rss/1"))
        	{
        	//	Thread.sleep(2000) ;
        		
        		cd.navigate().back() ;
        		
//        		cd.navigate().to("https://demowebshop.tricentis.com/") ;
//        		String st1 = cd.getCurrentUrl() ;
//        		Thread.sleep(2000) ;
//        		System.out.println(st1);
        	
        	}
        	
        	System.out.println("hjjhjhjkhkj");
        	
        //	Thread.sleep(2000) ;

        	
        }
        
        
	}
}
