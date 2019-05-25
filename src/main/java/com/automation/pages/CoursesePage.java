package com.automation.pages;
import com.automation.browser.Driver;
import com.automation.elements.*;
import com.automation.elements.clickableelements.*;
import com.automation.elements.readableelements.*;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;
import com.automation.browser.Driver;
public class CoursesePage{

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/CoursesePage.json");
	private Driver driver;
	private ExtentTest test;

	public CoursesePage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public CoursesePage(Driver driver) {
		this.driver = driver;
	}

private Alert ioi() {
		Alert ioi= (Alert) ElementFactory.createElement(ElementTypes.ALERT,elementParser, driver,"ioi");
		return ioi;
	}
}