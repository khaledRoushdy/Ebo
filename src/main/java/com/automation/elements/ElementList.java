package com.automation.elements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.automation.browser.Driver;

public class ElementList<T extends Element> extends Element {

	List<T> elements;
	public ElementList(By byLocator, Driver driver) {
		super(byLocator, driver);
		elements = new ArrayList<T>();
		// TODO Auto-generated constructor stub
	}

	public void getTextOfElements() {
		List<WebElement> e = getElements();
		for (WebElement webElement : e) {
			webElement.getText();
		}
		
	}
	
	
}
