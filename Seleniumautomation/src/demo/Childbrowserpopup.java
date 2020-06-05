package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Childbrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./s/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://live.skillrary.com/testing-app");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='LOGIN']")).click();
		driver.findElement(By.id("email")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("user");
		driver.findElement(By.xpath("//button[.='Login']")).sendKeys("user");
		WebElement ele = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//a[.='Selenium Training'])[1]")).click();
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		Alert b = driver.switchTo().alert();
		b.accept();
		driver.findElement(By.xpath("//li[@class='dropdown messages-menu']")).click();
		driver.findElement(By.xpath("//a[.='Go to Cart']")).click();
		driver.findElement(By.xpath("//button[.='Bank']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("firstname")).sendKeys("ghdghagh");
		driver.findElement(By.xpath("(//button[.='Success'])[1]")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println(driver.getWindowHandles());
		driver.quit();

	}

}
