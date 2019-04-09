package com.automation.elements;

import com.aventstack.extentreports.ExtentTest;

public interface IClickable {

	public void clickOnIt();
	public void clickOnItUsingJs();
	public void clickOnIt(String elementName,ExtentTest test);
}
