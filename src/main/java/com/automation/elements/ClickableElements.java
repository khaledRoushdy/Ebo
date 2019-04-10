package com.automation.elements;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public abstract class ClickableElements extends Element implements IClickable{
	public ClickableElements(By byLocator, Driver driver) {
		super(byLocator, driver);
	}

	@Override
	public void clickOnIt() {
		getElement().click();
	}

	@Override
	public void clickOnItUsingJs() {
		jsDriver.executeJsScript("arguments[0].click();", driver.getWebdriver(), getElement());
	}

	@Override
	public void clickOnIt(String elementName, ExtentTest test) {
		getElement().click();
		test.log(Status.INFO, elementName + " has been clicked");
	}

	@Override
	public void clickOnItUsingJs(String elementName, ExtentTest test) {
		jsDriver.executeJsScript("arguments[0].click();", driver.getWebdriver(), getElement());
		test.log(Status.INFO, elementName + " has been clicked");
	}
}
