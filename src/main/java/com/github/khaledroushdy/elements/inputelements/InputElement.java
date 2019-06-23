package com.github.khaledroushdy.elements.inputelements;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.elements.Element;
import com.github.khaledroushdy.elements.ITextable;

public abstract class InputElement extends Element implements ITextable {

	public InputElement(By byLocator, Driver driver) {
		super(byLocator, driver);
	}
	
	@Override
	public void enterText(String text) {
		getElement().sendKeys(text);
	}

	@Override
	public void enterTextUsingJs(String text) {
		String myText= "'"+text+"'";
		jsDriver.executeJsScript("arguments[0].value="+myText, driver.getWebdriver(),getElement());
	}

	@Override
	public void enterText(String text, String elementName, ExtentTest test) {
		getElement().sendKeys(text);
		test.log(Status.INFO, "\""+text+"\""+" has been entered in "+elementName+ " textbox");
	}

}
