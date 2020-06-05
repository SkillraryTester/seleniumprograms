package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoA {
	
@DataProvider
public Object[][] getdata()
{
	Object[][] a=new Object[3][2];
	a[0][0]="ABCDEFGH";
	a[0][1]="abcgdghhdgah";
	
	a[1][0]="123456";
	a[1][1]="463564156";
	
	a[2][0]="$%^Fgfgfg4326";
	a[2][1]="gasfagfga767##$";
	return a;		
		}

@Test(dataProvider="getdata")
public void createuser(String us,String pwd) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./s/chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("firstname")).sendKeys(us);
	driver.findElement(By.name("lastname")).sendKeys(pwd);
	Thread.sleep(3000);
	driver.close();
}


}
