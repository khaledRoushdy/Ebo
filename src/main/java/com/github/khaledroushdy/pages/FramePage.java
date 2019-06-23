package com.github.khaledroushdy.pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.elements.Frame;
import com.github.khaledroushdy.jsonParser.ElementParser;
import com.github.khaledroushdy.utilities.ElementUtilities;

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
