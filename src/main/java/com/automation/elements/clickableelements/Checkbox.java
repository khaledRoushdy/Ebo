package com.automation.elements.clickableelements;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.aventstack.extentreports.ExtentTest;

public class Checkbox extends ClickableElements{

	public Checkbox(By byLocator, Driver driver) {
		super(byLocator, driver);
	}
}
