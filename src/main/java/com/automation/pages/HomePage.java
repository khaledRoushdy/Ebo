package com.automation.pages;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.Button;
import com.automation.elements.Element;
import com.automation.elements.ElementTypes;
import com.automation.elements.HyperLink;
import com.automation.jsonParser.ElementParser;
import com.automation.utilities.ElementUtilities;
import com.aventstack.extentreports.ExtentTest;

public class HomePage {

	private ElementParser elementParser;
	private Driver driver;
	private ExtentTest test;

	public HomePage(Driver driver, ExtentTest test) {
		this.elementParser = new ElementParser("src/main/resources/objectRepository/HomePage.json");
		this.driver = driver;
		this.test = test;
	}

	private HyperLink loginAutomationLink() {
		return ElementUtilities.getHyperLink(elementParser, driver, "loginAutomationLink");
	}

	private HyperLink landingLink() {
		return ElementUtilities.getHyperLink(elementParser, driver, "landingLink");
	}

	public void goToAutomationLink() {
		loginAutomationLink().clickOnIt("login automation link", test);
	}

	public void goToLandingPage() {
		landingLink().clickOnIt("landing link", test);
	}
}
