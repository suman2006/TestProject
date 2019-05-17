package comoponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtils {

	public static WebDriver launchBrowser(WebDriver driver) {
		driver = new ChromeDriver();
		driver.get("");
		return driver;
		driver = new ChromeDriver();
		driver.get("");
		return driver;
		
	}
	
	public void m1(WebDriver driver){
		driver = new ChromeDriver();
	}

	public static void closeBrowser(WebDriver driver) {
		driver.quit();

	}

	public static void invokeApp(WebDriver driver) {
		driver.get("");

	}

}
