package com.github.khaledroushdy.pages;

import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.jsonParser.ElementParser;
import com.github.khaledroushdy.selectelements.DropDownList;
import com.github.khaledroushdy.utilities.ElementUtilities;

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
