package com.automation.browser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptDriver {

	private JavascriptExecutor js;

	public JavascriptExecutor getJs(WebDriver driver) {	
		js = (JavascriptExecutor) driver;
		return js;
	}	
}
