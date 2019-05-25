package com.automation.elements;

import java.util.List;

import com.aventstack.extentreports.ExtentTest;

public interface IListGetTextable {

	public List<String> getAllElementsText();
	public List<String> getAllElementsTextUsingJs();
	public List<String> getAllElementsText(ExtentTest test,String elementName);
	public List<String> getAllElementsTextUsingJs(ExtentTest test,String elementName);
}
