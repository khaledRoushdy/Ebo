package com.github.khaledroushdy.pages;
import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.*;
import com.github.khaledroushdy.elements.*;
import com.github.khaledroushdy.elements.readableelements.*;
import com.github.khaledroushdy.jsonParser.ElementParser;
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