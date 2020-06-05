package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Facebook1 {
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
		driver.findElement(By.name("lastname")).sendKeys("fdgfssahadfsghfdgafgfgaf");
		String t = driver.getTitle();
	//	Assert.assertEquals(t,"facebook12345");
		SoftAssert s=new SoftAssert();
		s.assertEquals(t,"facebokk1234hfgh");
		Reporter.log(t,true);
		Reporter.log(driver.getCurrentUrl(),true);
		s.assertAll();
	}

	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
