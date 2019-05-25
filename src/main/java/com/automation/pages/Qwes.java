package com.automation.pages;
import com.automation.browser.Driver;
import com.automation.elements.*;
import com.automation.elements.clickableelements.*;
import com.automation.elements.readableelements.*;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;
import com.automation.browser.Driver;
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