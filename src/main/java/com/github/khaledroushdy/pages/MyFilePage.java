
package com.github.khaledroushdy.pages;

import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.*;
import com.github.khaledroushdy.elements.*;
import com.github.khaledroushdy.elements.readableelements.*;
import com.github.khaledroushdy.jsonParser.ElementParser;

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