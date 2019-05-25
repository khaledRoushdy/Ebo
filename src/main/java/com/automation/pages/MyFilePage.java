
package com.automation.pages;

import com.automation.browser.Driver;
import com.automation.elements.*;
import com.automation.elements.clickableelements.*;
import com.automation.elements.readableelements.*;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;

public class MyFilePage {

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/myfile.json");
	private Driver driver;
	private ExtentTest test;

	public MyFilePage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public MyFilePage(Driver driver) {
		this.test = test;
	}

	@SuppressWarnings("unchecked")
	private Elements<TableRow> qqq() {
		Elements<TableRow> qqq = (Elements<TableRow>) ElementFactory.createListElement(ElementTypes.TABLEROW,
				elementParser, driver, "qqq");
		return qqq;
	}

	private Button sss() {
		Button sss = (Button) ElementFactory.createElement(ElementTypes.BUTTON, elementParser, driver, "sss");
		return sss;
	}

	@SuppressWarnings("unchecked")
	private Elements<TableColumn> eee() {
		Elements<TableColumn> eee = (Elements<TableColumn>) ElementFactory.createListElement(ElementTypes.TABLECOLUMN,
				elementParser, driver, "eee");
		return eee;
	}

	private Checkbox lolk() {
		Checkbox lolk = (Checkbox) ElementFactory.createElement(ElementTypes.CHECKBOX, elementParser, driver, "lolk");
		return lolk;
	}
}