package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sotware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=order");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.findElement(By.linkText(" //a[contains(text(),'Sign in')]		")).click();
		WebDriverWait w=new WebDriverWait(driver, 10);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		w.until(ExpectedConditions.elementToBeClickable(ele)).click();
		
		WebElement ele1 = driver.findElement(By.id("email"));
		w.until(ExpectedConditions.visibilityOf(ele1)).sendKeys("ggfjhgdjh");
		driver.findElement(By.id("passwd")).sendKeys("bharani123");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.xpath("(//a[@title='Printed Summer Dress'])[2]")).click();
		for(int i=1;i<=3;i++) {
		driver.findElement(By.cssSelector("i[class='icon-plus']")).click();
		}
		
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		
		driver.findElement(By.linkText("Proceed to checkout")).click();
		
		String t = driver.getTitle();
		System.out.println(t);
		
		if(t.equals("Order - My Store"))
		{
			System.out.println("Pass:End page is displayed");
		}
		else
		{
			System.out.println("Fail:End page is not dispalyed");
		}
     driver.close();
	}

}
