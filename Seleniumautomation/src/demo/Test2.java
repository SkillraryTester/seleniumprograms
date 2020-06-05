package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sotware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("username"));
		if(ele.isEnabled())
		{
			ele.sendKeys("admin");
			System.out.println("Pass: element is enabled");
		}
		else
		{
			System.out.println("Fail: element is not enabled");
		}
		
		WebElement ele1 = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(ele1.isSelected())
		{
			System.out.println("Pass: selected");
		}
		else
		{
			System.out.println("Fail: not selected");
		}
		
		WebElement ele2 = driver.findElement(By.xpath("//div[text()='Login ']"));
		if(ele2.isDisplayed())
		{
			ele2.click();
			System.out.println("Pass: button is dispalyed");
		}
		else
		{
			System.out.println("Fail:button is not dispalyed");
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
