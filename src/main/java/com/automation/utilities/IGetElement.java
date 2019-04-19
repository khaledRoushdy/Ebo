package com.automation.utilities;

import com.automation.browser.Driver;
import com.automation.elements.Element;
import com.automation.jsonParser.ElementParser;

public interface IGetElement {

	public Element getElement(ElementParser elementParser,Driver driver,String elementName);
}
