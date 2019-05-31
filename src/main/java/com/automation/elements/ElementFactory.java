package com.automation.elements;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.clickableelements.Alert;
import com.automation.elements.clickableelements.Button;
import com.automation.elements.clickableelements.Checkbox;
import com.automation.elements.clickableelements.Hyperlink;
import com.automation.elements.clickableelements.Image;
import com.automation.elements.clickableelements.Span;
import com.automation.elements.inputelements.Textarea;
import com.automation.elements.inputelements.Textbox;
import com.automation.elements.readableelements.Div;
import com.automation.elements.readableelements.ListItem;
import com.automation.elements.readableelements.OrderedList;
import com.automation.elements.readableelements.TableColumn;
import com.automation.elements.readableelements.TableData;
import com.automation.elements.readableelements.TableRow;
import com.automation.elements.readableelements.Tableheader;
import com.automation.elements.readableelements.UnorderedList;
import com.automation.jsonParser.ElementParser;
import com.automation.selectelements.DropDownList;

public class ElementFactory {

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
