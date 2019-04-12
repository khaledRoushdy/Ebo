package com.automation.elements;

import com.aventstack.extentreports.ExtentTest;

public interface IAlertable {

	public void acceptAlert();
	
	public void dismissAlert();
	
	public void acceptAlert(ExtentTest test,String alertName);
	
	public void dismissAlert(ExtentTest test,String alertName);
}
