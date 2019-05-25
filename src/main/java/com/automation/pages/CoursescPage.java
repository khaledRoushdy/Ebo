package com.automation.pages;
import com.automation.browser.Driver;
import com.automation.elements.*;
import com.automation.elements.clickableelements.*;
import com.automation.elements.readableelements.*;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;
import com.automation.browser.Driver;

public class CoursescPage{

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/CoursescPage.json");
	private Driver driver;
	private ExtentTest test;

	public CoursescPage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public CoursescPage(Driver driver) {
		this.driver = driver;
	}

private Alert ert() {
		Alert ert= (Alert) ElementFactory.createElement(ElementTypes.ALERT,elementParser, driver,"ert");
		return ert;
	}
}