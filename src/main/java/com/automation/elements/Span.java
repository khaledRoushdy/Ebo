package com.automation.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.browser.Driver;
import com.automation.utilities.DriverUtilities;

public class Span extends Element implements IGetTexable {

	public Span(By byLocator, Driver driver) {
		super(byLocator, driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getText() {
		return getElement().getText();	
	}

	@Override
	public String getTextUsingJs() {	
		return DriverUtilities.executeJsScript("return arguments[0].text", driver.getWebdriver(),getElement()).toString();
	}	
}
