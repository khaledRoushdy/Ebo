package com.automation.pages;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.HyperLink;
import com.automation.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;

public class HomePage {

	private ElementParser elementParser;
	private Driver driver;
	private ExtentTest test;
	
	public HomePage(Driver driver,ExtentTest test) {
		this.elementParser = new ElementParser("src/main/resources/objectRepository/HomePage.json");
		this.driver = driver;
		this.test = test;
	}
	
	private HyperLink loginAutomationLink() {
		By languageLinkLocator= elementParser.getElementByName("loginAutomationLink");
		HyperLink languageLink = new HyperLink(languageLinkLocator, driver);
		return languageLink;
	}
	
	private HyperLink landingLink() {
		By landingLinkLocator= elementParser.getElementByName("landingLink");
		HyperLink landingLink = new HyperLink(landingLinkLocator, driver);
		return landingLink;
	}
	
	public void goToAutomationLink() {
		loginAutomationLink().clickOnIt("login automation link",test);	
	}

	public void goToLandingPage() {
		landingLink().clickOnIt("landing link", test);
	}
}
