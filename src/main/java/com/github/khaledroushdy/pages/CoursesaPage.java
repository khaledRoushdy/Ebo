package com.github.khaledroushdy.pages;
import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.*;
import com.github.khaledroushdy.elements.*;
import com.github.khaledroushdy.elements.readableelements.*;
import com.github.khaledroushdy.jsonParser.ElementParser;
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