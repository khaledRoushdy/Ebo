package com.automation.pages;

import com.automation.browser.Driver;
import com.automation.elements.*;
import com.automation.elements.clickableelements.*;
import com.automation.elements.readableelements.*;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;
import com.automation.browser.Driver;

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