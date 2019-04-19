package com.automation.utilities;

import com.automation.browser.Driver;
import com.automation.elements.Element;
import com.automation.jsonParser.ElementParser;

public class BaseElement {

	private IGetElement element;
	public BaseElement(IGetElement element) {
		this.element = element;
	}
	
	public Element getElement(ElementParser parser,Driver driver,String elementName) {
		return element.getElement(parser,driver,elementName);
	}
}
