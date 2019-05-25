package com.automation.pages;
import com.automation.browser.Driver;
import com.automation.elements.*;
import com.automation.elements.clickableelements.*;
import com.automation.elements.readableelements.*;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;
import com.automation.browser.Driver;
public class CoursesB{

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/CoursesB.json");
	private Driver driver;
	private ExtentTest test;

	public CoursesB(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public CoursesB(Driver driver) {
		this.driver = driver;
	}

	private Alert qqq() {
		Alert qqq= (Alert) ElementFactory.createElement(ElementTypes.ALERT,elementParser, driver,"qqq");
		return qqq;
	}
}