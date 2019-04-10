package com.automation.elements;

import org.openqa.selenium.By;
import com.automation.browser.Driver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Button extends ClickableElements{

	public Button(By byLocator, Driver driver) {
		super(byLocator, driver);
	}

}
