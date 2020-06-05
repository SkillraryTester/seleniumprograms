package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sotware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		s.selectByIndex(4);
		s.selectByValue("1");
		s.selectByVisibleText("Nov");
		System.out.println(s.isMultiple());
		List<WebElement> op = s.getOptions();
		System.out.println(op.size());
		for(WebElement b:op)
		{
			System.out.println(b.getText());
		}
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
