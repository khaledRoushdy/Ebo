package com.github.khaledroushdy.elements;

import org.openqa.selenium.By;

import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.clickableelements.Alert;
import com.github.khaledroushdy.clickableelements.Button;
import com.github.khaledroushdy.clickableelements.Checkbox;
import com.github.khaledroushdy.clickableelements.Hyperlink;
import com.github.khaledroushdy.clickableelements.Image;
import com.github.khaledroushdy.clickableelements.Span;
import com.github.khaledroushdy.elements.inputelements.Textarea;
import com.github.khaledroushdy.elements.inputelements.Textbox;
import com.github.khaledroushdy.elements.readableelements.Div;
import com.github.khaledroushdy.elements.readableelements.ListItem;
import com.github.khaledroushdy.elements.readableelements.OrderedList;
import com.github.khaledroushdy.elements.readableelements.TableColumn;
import com.github.khaledroushdy.elements.readableelements.TableData;
import com.github.khaledroushdy.elements.readableelements.TableRow;
import com.github.khaledroushdy.elements.readableelements.Tableheader;
import com.github.khaledroushdy.elements.readableelements.UnorderedList;
import com.github.khaledroushdy.jsonParser.ElementParser;
import com.github.khaledroushdy.selectelements.DropDownList;

public class ElementFactory {

	/**
	 * creates the web element
	 * 
	 * @param type is the elementType enum ,all the web elements types are found there.
	 * @param parser is the element parser that is used to get the locator of the web element
	 * @param driver is the wrapped driver
	 * @param elementName is the name of the web element that is stored in the json file for each page.
	 * @return 	the web element created
	 */
	public static Element createElement(ElementTypes type, ElementParser parser, Driver driver, String elementName) {

		By elementLocator = parser.getElementByName(elementName);
		switch (type) {
		
		case ALERT:
			return new Alert(elementLocator, driver);
			
		case FRAME:
			return new Frame(elementLocator, driver);	
		
		case BUTTON:
			return new Button(elementLocator, driver);
		
		case SPAN:
			return new Span(elementLocator, driver);
			
		case TEXTBOX:
			return new Textbox(elementLocator, driver);
			
		case HYPERLINK:
			return new Hyperlink(elementLocator, driver);
			
		case DROPDOWNLIST:
			return new DropDownList(elementLocator,driver);
			
		case DIV:
			return new Div(elementLocator, driver);
		
		case CHECKBOX:
			return new Checkbox(elementLocator, driver);
		
		case TEXTAREA:
			return new Textarea(elementLocator, driver);
			
		case TABLEROW:
			return new TableRow(elementLocator, driver);
		
		case TABLECOLUMN:
			return new TableColumn(elementLocator, driver);
			
		case TABLEDATA:
			return new TableData(elementLocator, driver);
			
		case TABLEHEADER:
			return new Tableheader(elementLocator, driver);
			
		case IMAGE:
			return new Image(elementLocator, driver);
			
		case UNORDEREDLIST:
			return new UnorderedList(elementLocator, driver);
			
		case ORDEREDLIST:
			return new OrderedList(elementLocator, driver);
			
		case LISTITEM:
			return new ListItem(elementLocator, driver);
			
		default:
			break;
		}
		
		return null;
	}
	
	/**
	 * creates the list of web elements
	 * 
	 * @param type is the elementType enum ,all the web elements types are found there.
	 * @param parser is the element parser that is used to get the locator of the web element
	 * @param driver is the wrapped driver
	 * @param elementName is the name of the web element that is stored in the json file for each page.
	 * @return list of elements created
	 */
	public static Elements<?> createListElement(ElementTypes type, ElementParser parser, Driver driver, String elementName) {

		By elementLocator = parser.getElementByName(elementName);
		switch (type) {
		case BUTTON:
			return new Elements<Button>(elementLocator, driver, Button.class);
		
		case SPAN:
			return new Elements<Span>(elementLocator, driver,Span.class);
			
		case TEXTBOX:
			return new Elements<Textbox>(elementLocator, driver,Textbox.class);
			
		case HYPERLINK:
			return new Elements<Hyperlink>(elementLocator, driver,Hyperlink.class);
			
		case DROPDOWNLIST:
			return new Elements<DropDownList>(elementLocator,driver,DropDownList.class);
			
		case DIV:
			return new Elements<Div>(elementLocator, driver,Div.class);
		
		case CHECKBOX:
			return new Elements<Checkbox>(elementLocator, driver,Checkbox.class);
		
		case TEXTAREA:
			return new Elements<Textarea>(elementLocator, driver,Textarea.class);
		
		case TABLEHEADER:
			return new Elements<Tableheader>(elementLocator, driver,Tableheader.class);
		
		case TABLEROW:
			return new Elements<TableRow>(elementLocator, driver,TableRow.class);
		
		case TABLECOLUMN:
			return new Elements<TableColumn>(elementLocator, driver,TableColumn.class);
			
		case TABLEDATA:
			return new Elements<TableData>(elementLocator, driver,TableData.class);
			
		case IMAGE:
			return new Elements<Image>(elementLocator, driver,Image.class);
		
		case UNORDEREDLIST:
			return new Elements<UnorderedList>(elementLocator, driver, UnorderedList.class);
			
		case ORDEREDLIST:
			return new Elements<OrderedList>(elementLocator, driver, OrderedList.class);
			
		case LISTITEM:
			return new Elements<ListItem>(elementLocator, driver, ListItem.class);
			
		default:
			break;
		}
		return null;
	}
}
