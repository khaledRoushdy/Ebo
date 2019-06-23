package com.github.khaledroushdy.pages;

import java.util.List;

import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.Button;
import com.github.khaledroushdy.clickableelements.Hyperlink;
import com.github.khaledroushdy.elements.ElementFactory;
import com.github.khaledroushdy.elements.ElementTypes;
import com.github.khaledroushdy.elements.Elements;
import com.github.khaledroushdy.elements.inputelements.Textbox;
import com.github.khaledroushdy.jsonParser.ElementParser;
import com.github.khaledroushdy.utilities.BaseElement;
import com.github.khaledroushdy.utilities.ElementUtilities;
import com.github.khaledroushdy.utilities.GetTextBox;

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
		BaseElement element = new BaseElement(new GetTextBox());
		Textbox email = (Textbox) element.getElement(elementParser, driver, "email");
		return email;
		// return ElementUtilities.getTextbox(elementParser, driver, "email");
	}

	private Textbox password() {
		Textbox password = (Textbox) ElementFactory.createElement(ElementTypes.TEXTBOX, elementParser, driver,
				"password");
		return password;
		// return ElementUtilities.getTextbox(elementParser, driver, "password");
	}

	@SuppressWarnings("unchecked")
	private Elements<Hyperlink> passwordsList() {	
		Elements<Hyperlink> passwordLists = (Elements<Hyperlink>) ElementFactory
				.createListElement(ElementTypes.HYPERLINK, elementParser, driver, "mypasswords");
		return passwordLists;
	}

	private Button signIn() {
		return ElementUtilities.getButton(elementParser, driver, "signin");
	}

	public List<String> getMypasswords() {
		return passwordsList().getAllElementsAttributeValue("value");
	}

	public void signIntoCourses(String userName, String password) {

		//System.out.println(passwordsList().getInstanceOfT());
		email().enterTextUsingJs(userName);
		password().enterTextUsingJs(password);
		signIn().clickOnIt("sign in", test);
		//passwordsList().getText();
	}
}
