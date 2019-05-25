package com.automation.pages;

import com.automation.browser.Driver;
import com.automation.elements.*;
import com.automation.elements.clickableelements.*;
import com.automation.elements.readableelements.*;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;
import com.automation.browser.Driver;

public class Jpage {

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/Jpage.json");
	private Driver driver;
	private ExtentTest test;

	public Jpage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public Jpage(Driver driver) {
		this.driver = driver;
	}

	private Alert lpl() {
		Alert lpl = (Alert) ElementFactory.createElement(ElementTypes.ALERT, elementParser, driver, "lpl");
		return lpl;
	}

	@SuppressWarnings("unchecked")
	private Elements<Alert> aqa() {
		Elements<Alert> aqa = (Elements<Alert>) ElementFactory.createListElement(ElementTypes.ALERT, elementParser,
				driver, "aqa");
		return aqa;
	}
}