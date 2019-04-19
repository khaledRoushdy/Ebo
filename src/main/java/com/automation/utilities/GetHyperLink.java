package com.automation.utilities;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.Element;
import com.automation.elements.clickableelements.HyperLink;
import com.automation.jsonParser.ElementParser;

public class GetHyperLink implements IGetElement {

	@Override
	public Element getElement(ElementParser elementParser, Driver driver, String elementName) {
		By elementLocator = elementParser.getElementByName(elementName);
		HyperLink element = new HyperLink(elementLocator, driver);
		return element;
	}
}
