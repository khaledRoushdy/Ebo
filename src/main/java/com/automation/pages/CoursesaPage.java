package com.automation.pages;
import com.automation.browser.Driver;
import com.automation.elements.*;
import com.automation.elements.clickableelements.*;
import com.automation.elements.readableelements.*;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;
import com.automation.browser.Driver;
public class CoursesaPage{

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/CoursesaPage.json");
	private Driver driver;
	private ExtentTest test;

	public CoursesaPage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public CoursesaPage(Driver driver) {
		this.driver = driver;
	}

private Alert juj() {
		Alert juj= (Alert) ElementFactory.createElement(ElementTypes.ALERT,elementParser, driver,"juj");
		return juj;
}
}