package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="username")
	private WebElement ustb;
	
	@FindBy(name="pwd")
	private WebElement pwdtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement btn;
	
		Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void username(String us)
	{
		ustb.sendKeys(us);
	}

	public void password(String pw)
	{
		 pwdtb.sendKeys(pw);
	}
	
	public void loginbtn()
	{
		btn.click();
	}
	
}
