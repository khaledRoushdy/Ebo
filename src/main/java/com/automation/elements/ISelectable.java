package com.automation.elements;

import com.aventstack.extentreports.ExtentTest;

public interface ISelectable {

	public void selectByVisibleText(String text);
	public void deselectByVisibleText(String text);
	public void selectByIndex(int index);
	public void deselectByIndex(int index);
	public void selectByValue(String value);
	public void deselectByValue(String value);
	public boolean isMultiple();
	public void selectByVisibleText(String text,String dropDownName,ExtentTest test);
	public void deselectByVisibleText(String text,String dropDownName,ExtentTest test);
	public void selectByIndex(int index,String dropDownName,ExtentTest test);
	public void deselectByIndex(int index,String dropDownName,ExtentTest test);
	public void selectByValue(String value,String dropDownName,ExtentTest test);
	public void deselectByValue(String value,String dropDownName,ExtentTest test);
	
	
}
