package com.github.khaledroushdy.pages;

import java.util.List;

import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.*;
import com.github.khaledroushdy.elements.*;
import com.github.khaledroushdy.elements.readableelements.*;
import com.github.khaledroushdy.jsonParser.ElementParser;

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