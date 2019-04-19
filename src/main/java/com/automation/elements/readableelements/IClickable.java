package com.automation.elements.readableelements;

import com.aventstack.extentreports.ExtentTest;

public interface IClickable {

	public void clickOnIt();
	public void clickOnItUsingJs();
	public void clickOnIt(String elementName,ExtentTest test);
	public void clickOnItUsingJs(String elementName,ExtentTest test);
}
