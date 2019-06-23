package com.github.khaledroushdy.clickableelements;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;

public class Checkbox extends ClickableElements{

	public Checkbox(By byLocator, Driver driver) {
		super(byLocator, driver);
	}
}
