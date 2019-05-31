package com.automation.pages;

import java.util.List;

import com.automation.browser.Driver;
import com.automation.elements.*;
import com.automation.elements.clickableelements.*;
import com.automation.elements.readableelements.*;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;
import com.automation.browser.Driver;

public class UltimateQcPage{

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/ultimateQcPage.json");
	private Driver driver;
	private ExtentTest test;

	public UltimateQcPage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public UltimateQcPage(Driver driver) {
		this.driver = driver;
	}

	@SuppressWarnings("unchecked")
	private Elements<Hyperlink> links() {
		Elements<Hyperlink> links= (Elements<Hyperlink>) ElementFactory.createListElement(ElementTypes.HYPERLINK,elementParser, driver,"links");
		return links;
	}
	
	public List<String> getLinks(){
		return links().getAllElementsText();
	}
}