package com.automation.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Textbox extends Element implements ITextable {

	public Textbox(By byLocator, WebDriver driver) {
		super(byLocator, driver);
	}

	@Override
	public void enterText(String text) {
		getElement().sendKeys(text);
	}

	@Override
	public void enterTextUsingJs(String text) {
		
	}
}
