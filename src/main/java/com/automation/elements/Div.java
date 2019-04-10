package com.automation.elements;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Div extends Element implements IGetTexable {

	public Div(By byLocator, Driver driver) {
		super(byLocator, driver);
	}

	@Override
	public String getText() {
		return getElement().getText();
	}

	@Override
	public String getTextUsingJs() {
		return jsDriver.executeJsScript("return arguments[0].text", driver.getWebdriver(), getElement()).toString();
	}

	@Override
	public String getText(ExtentTest test, String elementName) {
		String text = getElement().getText();
		test.log(Status.INFO, text + " has been gotten from " + elementName);
		return text;
	}

	@Override
	public String getTextUsingJs(ExtentTest test, String elementName) {
		String text = jsDriver.executeJsScript("return arguments[0].text", driver.getWebdriver(), getElement())
				.toString();
		test.log(Status.INFO, text + " has been gotten from " + elementName);
		return text;
	}
}

