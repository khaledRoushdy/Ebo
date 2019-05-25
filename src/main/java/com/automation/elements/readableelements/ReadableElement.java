package com.automation.elements.readableelements;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.Element;
import com.automation.elements.IGetTexable;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ReadableElement extends Element implements IGetTexable{

	public ReadableElement(By byLocator, Driver driver) {
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

	@Override
	public String getAttributeValue() {
		String attributeValue = getElement().getAttribute("value");
		return attributeValue;
	}

	@Override
	public String getAttributeValue(ExtentTest test, String elementName) {
		String attributeValue = getElement().getAttribute("value");
		test.log(Status.INFO, attributeValue + " has been gotten from " + elementName);
		return attributeValue;
	}
}
