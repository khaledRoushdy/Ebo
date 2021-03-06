package com.github.khaledroushdy.utilities;

import org.openqa.selenium.By;

import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.Hyperlink;
import com.github.khaledroushdy.elements.Element;
import com.github.khaledroushdy.jsonParser.ElementParser;

public class GetHyperLink implements IGetElement {

	@Override
	public Element getElement(ElementParser elementParser, Driver driver, String elementName) {
		By elementLocator = elementParser.getElementByName(elementName);
		Hyperlink element = new Hyperlink(elementLocator, driver);
		return element;
	}
}
