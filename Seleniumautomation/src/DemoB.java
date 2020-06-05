import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoB {
	public WebDriver driver;
	static
	
	{
		System.setProperty("webdriver.chrome.driver","./s/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./s/geckodriver.exe");
		}
	
	@Parameters({"browsername"})
	@Test
	public void testA(String browser) throws InterruptedException
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.facebook.com/");
	driver.findElement(By.name("firstname")).sendKeys("fdhghsgfhh");
	Thread.sleep(5000);
	driver.findElement(By.name("lastname")).sendKeys("fdgfssahadfsghfdgafgfgaf");
	Reporter.log(driver.getTitle());
	//driver.close();
	}

}
