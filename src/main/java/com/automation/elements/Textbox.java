package com.automation.elements;

import org.openqa.selenium.By;
import com.automation.browser.Driver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Textbox extends Element implements ITextable {

	public Textbox(By byLocator, Driver driver) {
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
