package com.automation.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.automation.browser.JavascriptDriver;

public class DriverUtilities {

	public static Object executeJsScript(String script,WebDriver driver,WebElement element) {
		JavascriptDriver jsDriver = new JavascriptDriver();
		return jsDriver.getJs(driver).executeScript(script, element);
	}
}
