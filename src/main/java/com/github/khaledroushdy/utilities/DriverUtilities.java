package com.github.khaledroushdy.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.khaledroushdy.browser.JavascriptDriver;

public class DriverUtilities {

	public static Object executeJsScript(String script,WebDriver driver,WebElement element) {
		JavascriptDriver jsDriver = new JavascriptDriver();
		return jsDriver.getJs(driver).executeScript(script, element);
	}
	
	public static void executeJsScript(String script,WebDriver driver) {
		JavascriptDriver jsDriver = new JavascriptDriver();
		jsDriver.getJs(driver).executeScript(script);
	}
}
