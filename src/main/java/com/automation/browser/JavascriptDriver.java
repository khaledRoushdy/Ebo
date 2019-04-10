package com.automation.browser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptDriver {

	private JavascriptExecutor js;
	
	public JavascriptExecutor getJs(WebDriver driver) {
		js = (JavascriptExecutor) driver;
		return js;
	}

	public Object executeJsScript(String script, WebDriver driver, WebElement element) {
		return getJs(driver).executeScript(script, element);
	}
	
	public void executeJsScript(String script, WebDriver driver) {
		getJs(driver).executeScript(script);
	}
}
