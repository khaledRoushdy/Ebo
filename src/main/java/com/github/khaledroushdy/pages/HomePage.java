package com.github.khaledroushdy.pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.Button;
import com.github.khaledroushdy.clickableelements.Hyperlink;
import com.github.khaledroushdy.elements.Element;
import com.github.khaledroushdy.elements.ElementTypes;
import com.github.khaledroushdy.jsonParser.ElementParser;
import com.github.khaledroushdy.utilities.BaseElement;
import com.github.khaledroushdy.utilities.ElementUtilities;
import com.github.khaledroushdy.utilities.GetHyperLink;

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
