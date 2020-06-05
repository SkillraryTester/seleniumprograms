package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sotware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://live.skillrary.com/testing-app/");
		WebElement ele = driver.findElement(By.id("cars"));
		Select s=new Select(ele);
		s.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("199");
		
		System.out.println(s.isMultiple());
//		s.deselectByIndex(0);
//		Thread.sleep(3000);
//		s.deselectByValue("199");
//		Thread.sleep(3000);
//		s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
//		Thread.sleep(3000);
//		
		
		s.deselectAll();
		driver.close();
		
	}

}
