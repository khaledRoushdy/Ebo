package com.github.khaledroushdy.pages;
import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.*;
import com.github.khaledroushdy.elements.*;
import com.github.khaledroushdy.elements.readableelements.*;
import com.github.khaledroushdy.jsonParser.ElementParser;
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