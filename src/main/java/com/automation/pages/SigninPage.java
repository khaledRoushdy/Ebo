package com.automation.pages;

import java.util.List;
import com.automation.browser.Driver;
import com.automation.elements.ElementFactory;
import com.automation.elements.Elements;
import com.automation.elements.ElementTypes;
import com.automation.elements.clickableelements.Button;
import com.automation.elements.clickableelements.Hyperlink;
import com.automation.elements.inputelements.Textbox;
import com.automation.jsonParser.ElementParser;
import com.automation.utilities.BaseElement;
import com.automation.utilities.ElementUtilities;
import com.automation.utilities.GetTextBox;
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
