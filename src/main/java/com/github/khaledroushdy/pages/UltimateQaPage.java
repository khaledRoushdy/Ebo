package com.github.khaledroushdy.pages;

import java.util.List;

import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.Alert;
import com.github.khaledroushdy.clickableelements.Button;
import com.github.khaledroushdy.clickableelements.Hyperlink;
import com.github.khaledroushdy.elements.ElementFactory;
import com.github.khaledroushdy.elements.ElementTypes;
import com.github.khaledroushdy.elements.Elements;
import com.github.khaledroushdy.jsonParser.ElementParser;

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