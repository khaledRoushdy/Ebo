package com.automation.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Span extends Element implements IGetTexable {

	public Span(By byLocator, WebDriver driver) {
		super(byLocator, driver);
	}

	@Override
	public String getText() {
		return getElement().getText();
		
	}

	@Override
	public String getTextUsingJs() {
		// TODO Auto-generated method stub
		return null;
	}	
}
