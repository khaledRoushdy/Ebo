package com.github.khaledroushdy.pages;
import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.*;
import com.github.khaledroushdy.elements.*;
import com.github.khaledroushdy.elements.readableelements.*;
import com.github.khaledroushdy.jsonParser.ElementParser;

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