package com.automation.pages;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.Frame;
import com.automation.jsonParser.ElementParser;
import com.automation.utilities.ElementUtilities;
import com.aventstack.extentreports.ExtentTest;

public class FramePage {

	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/FramePage.json");
	private Driver driver;
	private ExtentTest test;

	public FramePage(Driver driver) {
		this.driver = driver;
	}

	public FramePage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	private Frame frame() {
		return ElementUtilities.getFrame(elementParser, driver, "frame1");
	}

	public void goToFrame() {
		frame().switchToFrame(test, "frame1");
		driver.switchToDefault();
	}
}
