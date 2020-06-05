package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sotware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("selen");
		Thread.sleep(4000);
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='sbct1234']"));
		int c = ele1.size();
System.out.println(c);

for(WebElement b:ele1)
{
	System.out.println(b.getText());
}

driver.close();
	}

}
