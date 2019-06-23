package com.github.khaledroushdy.pages;
import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.*;
import com.github.khaledroushdy.elements.*;
import com.github.khaledroushdy.elements.readableelements.*;
import com.github.khaledroushdy.jsonParser.ElementParser;
public class Qwes{

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/qwes.json");
	private Driver driver;
	private ExtentTest test;

	public Qwes(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public Qwes(Driver driver) {
		this.driver = driver;
}

private Alert qwq() {
Alert qwq= (Alert) ElementFactory.createElement(ElementTypes.ALERT,elementParser, driver,"qwq");
return qwq;
}
}