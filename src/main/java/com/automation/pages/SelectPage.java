package com.automation.pages;

import com.automation.browser.Driver;
import com.automation.elements.DropDownList;
import com.automation.jsonParser.ElementParser;
import com.automation.utilities.ElementUtilities;
import com.aventstack.extentreports.ExtentTest;

public class SelectPage {

	private ElementParser elementParser;
	private Driver driver;
	private ExtentTest test;

	public SelectPage(Driver driver, ExtentTest test) {
		this.elementParser = new ElementParser("src/main/resources/objectRepository/SelectPage.json");
		this.driver = driver;
		this.test = test;
	}

	private DropDownList continents() {
		return ElementUtilities.getDropDownList(elementParser, driver, "Continents");
	}

	public void selectContient(String continentName) {
		continents().moveToElement();
		continents().selectByVisibleText(continentName, "Continents", test);
	}
}
