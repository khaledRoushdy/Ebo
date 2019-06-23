package com.github.khaledroushdy.utilities;
import java.util.List;

import org.openqa.selenium.By;

import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.Button;
import com.github.khaledroushdy.clickableelements.Hyperlink;
import com.github.khaledroushdy.elements.Element;
import com.github.khaledroushdy.elements.ElementTypes;
import com.github.khaledroushdy.elements.Frame;
import com.github.khaledroushdy.elements.inputelements.Textbox;
import com.github.khaledroushdy.jsonParser.ElementParser;
import com.github.khaledroushdy.selectelements.DropDownList;


public class ElementUtilities {
	
	public static Element getElement(IGetElement element,ElementParser parser,Driver driver,String elementName) {
		BaseElement baseElement = new BaseElement(element);
		Element e= baseElement.getElement(parser, driver, elementName);
		return e;
	}
	
	public static Hyperlink getHyperLink(ElementParser elementParser,Driver driver,String elementName) {
		By hyperLinkLocator= elementParser.getElementByName(elementName);
		Hyperlink hyperLink = new Hyperlink(hyperLinkLocator, driver);
		return hyperLink;
	}
	
	public static List<Hyperlink> getListOfHyperLinks(ElementParser elementParser,Driver driver,String elementName){
		By hyperLinkLocator= elementParser.getElementByName(elementName);
		Hyperlink hyperLink = new Hyperlink(hyperLinkLocator, driver);
		//hyperLink.getTextOfElements();
		return null;
	}
	
	public static Textbox getTextbox(ElementParser elementParser,Driver driver,String elementName) {
		By textboxLocator= elementParser.getElementByName(elementName);	
		Textbox textbox = new Textbox(textboxLocator, driver);
		return textbox;
	}
	
	public static Button getButton(ElementParser elementParser,Driver driver,String elementName) {
		By buttonLocator= elementParser.getElementByName(elementName);	
		Button button = new Button(buttonLocator, driver);
		return button;
	}
	
	public static DropDownList getDropDownList(ElementParser elementParser ,Driver driver,String elementName) {
		By dropDownLocator = elementParser.getElementByName(elementName);
		DropDownList dropDownList = new DropDownList(dropDownLocator, driver);
		return dropDownList;
	}
	
	public static Frame getFrame(ElementParser elementParser,Driver driver,String elementName) {
		By frameLocator = elementParser.getElementByName(elementName);
		Frame frame = new Frame(frameLocator,driver);
		return frame;
	}
	
	public static Element getWebElement(ElementTypes type,ElementParser elementParser,Driver driver,String elementName) {
		
		By elementLocator= elementParser.getElementByName(elementName);	
		switch (type) {
		case BUTTON:
			return new Button(elementLocator,driver);
		case TEXTBOX:
			return new Textbox(elementLocator, driver);
		case HYPERLINK:
			return new Hyperlink(elementLocator, driver);	
		default:
			break;
		}
		return null;
	}
}
