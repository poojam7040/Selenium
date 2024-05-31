package parameter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProvider.DataProviderUtility;

public class GiftCard extends BaseClassForDWs{

	
	@Test(dataProvider = "giftCard")
	public void giftCard(String recName,String recMail, String name,String email,String message) throws FileNotFoundException
	{
	
		cd.findElement(By.partialLinkText("Gift Card")) ;
		
		cd.findElement(By.xpath("//input[@value='Add to cart']")) ;

		cd.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys(recName) ;
		
		cd.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys(recMail) ;

		cd.findElement(By.xpath("//input[@class='sender-name']")).sendKeys(name) ;

		cd.findElement(By.xpath("//input[@class='sender-email']")).sendKeys(email) ;

		cd.findElement(By.xpath("//textarea[@class='message']")).sendKeys(message) ;

	
		
	}
	
	@DataProvider(name = "giftCard")
    Object[][] sender() throws EncryptedDocumentException, IOException
	  {
		  return  DataProviderUtility.giftCardDetails() ;
	  }
	  
	
}
