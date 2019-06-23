package com.github.khaledroushdy.pages;

import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.*;
import com.github.khaledroushdy.elements.*;
import com.github.khaledroushdy.elements.readableelements.*;
import com.github.khaledroushdy.jsonParser.ElementParser;

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