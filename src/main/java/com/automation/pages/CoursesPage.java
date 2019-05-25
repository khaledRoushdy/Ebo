package com.automation.pages;
import com.automation.browser.Driver;
import com.automation.elements.*;
import com.automation.elements.clickableelements.*;
import com.automation.elements.readableelements.*;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;
import com.automation.browser.Driver;
public class CoursesPage{

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/CoursesPage.json");
	private Driver driver;
	private ExtentTest test;

	public CoursesPage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public CoursesPage(Driver driver) {
		this.driver = driver;
	}

	private Alert yuiop() {
Alert yuiop= (Alert) ElementFactory.createElement(ElementTypes.ALERT,elementParser, driver,"yuiop");
return yuiop;
}
}