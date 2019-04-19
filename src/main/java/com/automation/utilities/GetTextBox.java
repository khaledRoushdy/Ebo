package com.automation.utilities;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.Element;
import com.automation.elements.inputelements.Textbox;
import com.automation.jsonParser.ElementParser;

public class GetTextBox implements IGetElement{

	@Override
	public Element getElement(ElementParser elementParser, Driver driver, String elementName) {
		
		By elementLocator = elementParser.getElementByName(elementName);
		Textbox element = new Textbox(elementLocator,driver);
		return element;
	}

}
