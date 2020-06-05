package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sotware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele1 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		WebElement ele2 = driver.findElement(By.xpath("//h1[.='Block 4']"));
		
		Actions a =new Actions(driver);
		Thread.sleep(4000);
		a.dragAndDrop(ele1,ele2).perform();
		
		Thread.sleep(4000);
		driver.close();
	}

}
