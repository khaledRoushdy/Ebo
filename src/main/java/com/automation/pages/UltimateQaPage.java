package com.automation.pages;

import java.util.List;

import com.automation.browser.Driver;
import com.automation.elements.ElementFactory;
import com.automation.elements.ElementTypes;
import com.automation.elements.Elements;
import com.automation.elements.clickableelements.Alert;
import com.automation.elements.clickableelements.Button;
import com.automation.elements.clickableelements.Hyperlink;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;

public class UltimateQaPage{

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/ultimateQaPage.json");
	private Driver driver;
	private ExtentTest test;

	public UltimateQaPage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public UltimateQaPage(Driver driver) {
		this.driver = driver;
	}

	@SuppressWarnings("unchecked")
	private Elements<Hyperlink> links() {
		Elements<Hyperlink> links= (Elements<Hyperlink>) ElementFactory.createListElement(ElementTypes.HYPERLINK,elementParser, driver,"links");
		return links;
	}
	private Button courses() {
		Button courses= (Button) ElementFactory.createElement(ElementTypes.BUTTON,elementParser, driver,"courses");
		return courses;
	}

	private Alert SeleniumResources() {
		Alert SeleniumResources= (Alert) ElementFactory.createElement(ElementTypes.ALERT,elementParser, driver,"SeleniumResources");
		return SeleniumResources;
	}

	private Button blog() {
		Button blog= (Button) ElementFactory.createElement(ElementTypes.BUTTON,elementParser, driver,"blog");
		return blog;
	}
	
	public List<String> getLinks(){
		return links().getAllElementsText();
	}

}