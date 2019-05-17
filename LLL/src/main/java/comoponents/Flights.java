package comoponents;

import org.openqa.selenium.WebDriver;

import objects.Login_obj;

public class Flights {
	
	public static WebDriver driver;

	public static void enterValidCredentailsAndSubmit(WebDriver driver) {
		enterUserId("gjg");
		enterPassword("gg");
		clickSubmit();

	}

	private static void clickSubmit() {
		// TODO Auto-generated method stub

	}

	private static void enterPassword(String string) {
	driver.findElement(Login_obj.edit_password).sendKeys("");

	}

	private static void enterUserId(String string) {
		// TODO Auto-generated method stub

	}

	public static void enterInValidCredentailsAndSubmit(WebDriver driver) {
		enterUserId("gj");
		enterPassword("yyy");
		clickSubmit();

	}

	public static void verifyErrorMsg(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public static void enterBlankCredentailsAndSubmit(WebDriver driver) {
		enterUserId("");
		enterPassword("");
		clickSubmit();

	}

	public static void enterSpecialCredentailsAndSubmit(WebDriver driver) {
		enterUserId("#^%$^");
		enterPassword("#^%$^");
		clickSubmit();

	}

}
