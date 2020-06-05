package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sceenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./s/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//Typecasting
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		//required location
		File dest=new File("./photo/google.png");
		FileUtils.copyFile(src, dest);
		
		driver.close();
	}

}
