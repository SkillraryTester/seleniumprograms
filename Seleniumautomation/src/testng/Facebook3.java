package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook3 {
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver","./s/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
	
	@Test
	public void login()
	{
		driver.findElement(By.name("firstname")).sendKeys("fdhghsgfhh");
		driver.findElement(By.name("lastname123")).sendKeys("fdgfssahadfsghfdgafgfgaf");
		driver.findElement(By.name("reg_passwd__")).sendKeys("gvfdgfghghdghafghfghg");
		String t = driver.getTitle();
		Reporter.log(t,true);
		Reporter.log(driver.getCurrentUrl(),true);
	}

	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}


}
