package com.automation.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.browser.Driver;
import com.automation.utilities.DriverUtilities;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Button extends Element implements IClickable{

	public Button(By byLocator, Driver driver) {
		super(byLocator, driver);
	}

	@Override
	public void clickOnIt() {
		getElement().click();
	}
	
	@Override
	public void clickOnItUsingJs() {
		DriverUtilities.executeJsScript("arguments[0].click();", driver.getWebdriver(),getElement());
	}

	@Override
	public void clickOnIt(String elementName,ExtentTest test) {
		getElement().click();
		test.log(Status.INFO, elementName+" has been clicked");
	}
	
}