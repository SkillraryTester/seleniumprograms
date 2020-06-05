package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sotware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//Typecasting
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		for(int i=0;i<=5;i++)
		{
		j.executeScript("window.scrollBy(0,500)");
		
	}
		Thread.sleep(5000);
driver.close();
}
}