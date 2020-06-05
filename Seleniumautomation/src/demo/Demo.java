package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./s/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	//	WebElement ele = driver.findElement(By.id("username"));
		Pom p=new Pom(driver);
		driver.navigate().refresh();
		//ele.sendKeys("admin");
		p.username("admin");
		Thread.sleep(5000);
		driver.close();

	}

}
