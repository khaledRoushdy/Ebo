package com.automation.elements;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.clickableelements.Button;
import com.automation.elements.clickableelements.HyperLink;
import com.automation.elements.inputelements.Textbox;
import com.automation.elements.readableelements.Span;
import com.automation.jsonParser.ElementParser;

public class ElementFactory {

	public static Element createElement(ElementTypes type, ElementParser parser, Driver driver, String elementName) {

		By elementLocator = parser.getElementByName(elementName);
		switch (type) {
		case BUTTON:
			return new Button(elementLocator, driver);
		
		case SPAN:
			return new Span(elementLocator, driver);
			
		case TEXTBOX:
			return new Textbox(elementLocator, driver);
			
		case HYPERLINK:
			return new HyperLink(elementLocator, driver);
			
		case DROPDOWNLIST:
			return new DropDownList(elementLocator,driver);
		default:
			break;
		}
		return null;
	}
}
