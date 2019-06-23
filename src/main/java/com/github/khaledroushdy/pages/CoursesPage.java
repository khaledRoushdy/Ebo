package com.github.khaledroushdy.pages;
import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.*;
import com.github.khaledroushdy.elements.*;
import com.github.khaledroushdy.elements.readableelements.*;
import com.github.khaledroushdy.jsonParser.ElementParser;
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