package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void logoutbtn()
	{
		logout.click();
	}
	

}
