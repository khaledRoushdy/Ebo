package com.automation.elements;

import com.aventstack.extentreports.ExtentTest;

public interface IMouseClickable {

	public void clickUsingActions();
	public void clickUsingActions(String elementName,ExtentTest test);
	public void clickAndHold();
	public void clickAndHold(String elementName,ExtentTest test);
	public void contextClick();
	public void contextClick(String elementName,ExtentTest test);
	public void doubleClick();
	public void doubleClick(String elementName,ExtentTest test);

}
