package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) {
//		System.setProperty("wedriver.chrome.driver","./software/chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();

		System.setProperty("webdriver.gecko.driver","./sotware/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	}

}
