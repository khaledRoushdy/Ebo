package com.automation.pages;

import com.automation.browser.Driver;
import com.automation.elements.*;
import com.automation.elements.clickableelements.*;
import com.automation.elements.readableelements.*;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;
import com.automation.browser.Driver;

public class LoginPage {

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/loginPage.json");
	private Driver driver;
	private ExtentTest test;

	public LoginPage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public LoginPage(Driver driver) {
		this.driver = driver;
	}

	@SuppressWarnings("unchecked")
	private Elements<Div> qwq() {
		Elements<Div> qwq = (Elements<Div>) ElementFactory.createListElement(ElementTypes.DIV, elementParser, driver,
				"qwq");
		return qwq;
	}
}