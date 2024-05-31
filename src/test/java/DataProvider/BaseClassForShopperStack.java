package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClassForShopperStack {

	//tc1
	//open browser,maximize,get into shoper stack , do login function , move cursor to men section and click tshirt 
	//add all product present in tshirt 
	//logout , close browser
	
	//tc2 
	//same as tc1 , click on account setting after login , select my profile option , click edit profile ,
	//change all data , submit 
	
	
	
    WebDriver cd ;
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException{
		
	    cd = new ChromeDriver() ;
		
		cd.get("https://www.shoppersstack.com/") ;
		
		cd.manage().window().maximize() ;
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
		Thread.sleep(2000) ;

	}
	
	@BeforeMethod
	public void loginIntoShoppersStack() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		Thread.sleep(2000) ;
		cd.findElement(By.id("loginBtn")) .click();
		
		Thread.sleep(2000) ;
		
        File path = new File("C:\\Users\\POOJA\\Desktop\\TestData.xlsx") ;	
		
		FileInputStream readFile = new FileInputStream(path) ;
		
		Workbook we = WorkbookFactory.create(readFile);
		
		org.apache.poi.ss.usermodel.Sheet sheet1 = we.getSheet("Sheet1") ;
		
		String gmail = sheet1.getRow(0).getCell(0).toString() ; 
		
		String pass = sheet1.getRow(0).getCell(1).toString() ; 
	
	    cd.findElement(By.id("Email")).sendKeys(gmail);

	    cd.findElement(By.id("Password")) .sendKeys(pass);
	      
	    cd.findElement(By.xpath("//span[text()='Login']")).click();
	 
	}
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		cd.findElement(By.xpath("//button[@aria-label='Account settings']")).click() ;
		
	    Thread.sleep(2000);
		
		cd.findElement(By.xpath("//li[text()='Logout']")).click() ;


	}
	
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		Thread.sleep(2000);
		
	//	cd.close() ;
		
	}
	
	
	@Test
	public void login() throws InterruptedException
	{
       Actions ac = new Actions(cd);
       
       WebElement men = cd.findElement(By.xpath("//a[text()='Men']")) ;
       
       ac.moveToElement(men) ;
       
       WebElement tshirts = cd.findElement(By.xpath("//a[text()='T-shirts']")) ;

       ac.click(tshirts) ;
       
       List<WebElement> addToCart = cd.findElements(By.linkText("//button[text()='add to cart']")) ;
       
       for (WebElement web : addToCart) 
       {
		
    	   System.out.println("djdjhwjkd");
    	   web.click() ;
    	   
    	   Thread.sleep(2000) ;
	   }
       
    
    		 
       
       
	}
	
	
	
	
	
	
	
	
	
	
}
