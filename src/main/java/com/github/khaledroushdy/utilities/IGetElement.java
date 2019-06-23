package com.github.khaledroushdy.utilities;

import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.elements.Element;
import com.github.khaledroushdy.jsonParser.ElementParser;

public interface IGetElement {

	public Element getElement(ElementParser elementParser,Driver driver,String elementName);
}
