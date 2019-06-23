package com.github.khaledroushdy.pages;

import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.*;
import com.github.khaledroushdy.elements.*;
import com.github.khaledroushdy.elements.readableelements.*;
import com.github.khaledroushdy.jsonParser.ElementParser;

public class ErPage {

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/erPage.json");
	private Driver driver;
	private ExtentTest test;
	
	public ErPage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public ErPage(Driver driver) {
		this.driver = driver;
	}

	private Alert ert() {
		Alert ert = (Alert) ElementFactory.createElement(ElementTypes.ALERT, elementParser, driver, "ert");
		return ert;
	}
}