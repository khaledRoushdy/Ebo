package com.automation.elements;

import org.openqa.selenium.By;

import com.automation.browser.Driver;

public class TextArea extends InputElement{

	public TextArea(By byLocator, Driver driver) {
		super(byLocator, driver);
	}
}