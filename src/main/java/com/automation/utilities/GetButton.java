package com.automation.utilities;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.Element;
import com.automation.elements.clickableelements.Button;
import com.automation.jsonParser.ElementParser;

public class GetButton implements IGetElement {

	@Override
	public Element getElement(ElementParser elementParser, Driver driver, String elementName) {
			
		By elementLocator= elementParser.getElementByName(elementName);	
		Button element = new Button(elementLocator,driver);
		return element;
	}

	

}
