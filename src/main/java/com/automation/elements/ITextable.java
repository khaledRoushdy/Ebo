package com.automation.elements;

import com.aventstack.extentreports.ExtentTest;

public interface ITextable {

	public void enterText(String text);
	public void enterTextUsingJs(String text);
	public void enterText(String text,String elementName,ExtentTest test);
}
