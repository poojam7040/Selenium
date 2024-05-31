package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLogin {

	
	private @FindBy(id="Email")
	WebElement username ;
	
	private @FindBy(id="Password")
	WebElement password ;
	
	private @FindBy(css ="input[value='Log in']")
	WebElement login_btn ;
	
	public DwsLogin(WebDriver cd) {

		PageFactory.initElements(cd,this);
	}
	
	public void username(String username)
	{
		this.username.sendKeys(username);
	}
	
	public void password(String password)
	{
		this.password.sendKeys(password);
	}
	
	
	public void login()
	{
		this.login_btn.click() ;
	}
	
	
}
