package comoponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtils {

	public static WebDriver launchBrowser(WebDriver driver) {
		driver = new ChromeDriver();
		return driver;
		
	}

	public static void closeBrowser(WebDriver driver) {
		driver.quit();

	}

	public static void invokeApp(WebDriver driver) {
		driver.get("");

	}

}
