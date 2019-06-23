package com.github.khaledroushdy.utilities;

import org.openqa.selenium.By;

import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.elements.Element;
import com.github.khaledroushdy.elements.inputelements.Textbox;
import com.github.khaledroushdy.jsonParser.ElementParser;

public class GetTextBox implements IGetElement{

	@Override
	public Element getElement(ElementParser elementParser, Driver driver, String elementName) {
		
		By elementLocator = elementParser.getElementByName(elementName);
		Textbox element = new Textbox(elementLocator,driver);
		return element;
	}

}
