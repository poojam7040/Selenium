package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

	private @FindBy(id="gender-female")
	WebElement gender ;
	
	private @FindBy(id="FirstName")
	WebElement firstName ;
	
	private @FindBy(id ="LastName")
	WebElement lastName ;
	
	
    private @FindBy(id="Email")
	WebElement email ;
    
    private @FindBy(id="Password")
 	WebElement password ;
    
    private @FindBy(id="ConfirmPassword")
 	WebElement confirmPassword ;
    
    private @FindBy(id="register-button")
  	WebElement register_btn ;
    
    
    
    
	public Register(WebDriver cd) {

		PageFactory.initElements(cd,this);
	}
	
	public void gender()
	{
		this.gender.click();
	}
	
	public void firstName(String firstName)
	{
		this.firstName.sendKeys(firstName);
	}
	
	public void lastName(String lastName)
	{
		this.lastName.sendKeys(lastName);
	}
	
	
	public void email(String email)
	{
		this.email.sendKeys(email); ;
	}
	
	public void password(String password)
	{
		this.password.sendKeys(password); ;
	}
	
	public void confirmPassword(String confirmPassword)
	{
		this.confirmPassword.sendKeys(confirmPassword); ;
	}
	
	
	public void register_btn()
	{
		this.register_btn.click();
	}
}
