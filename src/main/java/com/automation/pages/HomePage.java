package com.automation.pages;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.Element;
import com.automation.elements.ElementTypes;
import com.automation.elements.clickableelements.Button;
import com.automation.elements.clickableelements.Hyperlink;
import com.automation.jsonParser.ElementParser;
import com.automation.utilities.BaseElement;
import com.automation.utilities.ElementUtilities;
import com.automation.utilities.GetHyperLink;
import com.aventstack.extentreports.ExtentTest;

public class HomePage {

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/HomePage.json");
	private Driver driver;
	private ExtentTest test;

	public HomePage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public HomePage(Driver driver) {
		this.driver = driver;
	}

	private Hyperlink loginAutomationLink() {

		BaseElement element = new BaseElement(new GetHyperLink());
		Hyperlink link = (Hyperlink) element.getElement(elementParser, driver, "loginAutomationLink");
		return link;
	}

	private Hyperlink landingLink() {
		Hyperlink link = (Hyperlink) ElementUtilities.getElement(new GetHyperLink(), elementParser, driver,
				"landingLink");
		return link;
	}

	public void goToAutomationLink() {
		loginAutomationLink().clickOnItUsingJs();
		//loginAutomationLink().clickOnIt("login automation link", test);
	}

	public void goToLandingPage() {
		landingLink().clickOnIt("landing link", test);
	}
}
