package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getingdata {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./s/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Properties p=new Properties();
		p.load(new FileInputStream("./data.properties"));
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
		Thread.sleep(5000);
		driver.close();
		
	}

}