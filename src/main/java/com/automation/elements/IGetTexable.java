package com.automation.elements;

import com.aventstack.extentreports.ExtentTest;

public interface IGetTexable {

	public String getText();
	public String getTextUsingJs();
	public String getAttributeValue();
	public String getAttributeValue(ExtentTest test,String elementName);
	public String getText(ExtentTest test,String elementName);
	public String getTextUsingJs(ExtentTest test,String elementName);
}
