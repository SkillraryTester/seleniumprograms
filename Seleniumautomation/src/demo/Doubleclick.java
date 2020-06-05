package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sotware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://live.skillrary.com/testing-app");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//a[.='Selenium Training'])[1]")).click();
		WebElement ele1 = driver.findElement(By.id("add"));
		a.doubleClick(ele1).perform();
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
