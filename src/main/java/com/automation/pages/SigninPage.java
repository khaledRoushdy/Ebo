package com.automation.pages;

import com.automation.browser.Driver;
import com.automation.elements.Button;
import com.automation.elements.HyperLink;
import com.automation.elements.Textbox;
import com.automation.jsonParser.ElementParser;
import com.automation.utilities.ElementUtilities;
import com.aventstack.extentreports.ExtentTest;

public class SigninPage {

	private ElementParser elementParser;
	private Driver driver;
	private ExtentTest test;

	public SigninPage(Driver driver, ExtentTest test) {
		this.elementParser = new ElementParser("src/main/resources/objectRepository/SignInPage.json");
		this.driver = driver;
		this.test = test;
	}

	private Textbox email() {
		return ElementUtilities.getTextbox(elementParser, driver, "email");
	}

	private Textbox password() {
		return ElementUtilities.getTextbox(elementParser, driver, "password");
	}

	private Button signIn() {
		return ElementUtilities.getButton(elementParser, driver, "signin");
	}

	public void signIntoCourses(String userName, String password) {
		email().enterTextUsingJs(userName);
		password().enterTextUsingJs(password);
		signIn().clickOnIt("sign in", test);
	}
}
