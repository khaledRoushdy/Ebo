package com.github.khaledroushdy.utilities;

import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.elements.Element;
import com.github.khaledroushdy.jsonParser.ElementParser;

public class BaseElement {

	private IGetElement element;
	public BaseElement(IGetElement element) {
		this.element = element;
	}
	
	public Element getElement(ElementParser parser,Driver driver,String elementName) {
		return element.getElement(parser,driver,elementName);
	}
}
