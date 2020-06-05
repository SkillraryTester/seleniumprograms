package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sotware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[contains(.,'Register')])[1]")).click();
		driver.findElement(By.xpath("//button[@titile='I am Experienced']")).click();
		driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\HP\\Downloads\\7. HTML.pdf");
		Thread.sleep(8000);
		driver.close();

	}

}
