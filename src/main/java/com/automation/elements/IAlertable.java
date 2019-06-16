package com.automation.elements;

import com.aventstack.extentreports.ExtentTest;

public interface IAlertable {

	/**
	 * accepts the alert and close it.
	 * 
	 */
	public void acceptAlert();
	
	/**
	 * dismisses the alert and close it.
	 * 
	 */
	public void dismissAlert();
	
	/**
	 * accepts the alert and close it.
	 * 
	 * @param test is the test case from the extent report to log your test steps.
	 * @param alertName is the name of the alert that is used for the test steps logging.
	 */
	public void acceptAlert(ExtentTest test,String alertName);
	
	/**
	 * dismiss the alert and close it.
	 * 
	 * @param test is the test case from the extent report to log your test steps.
	 * @param alertName is the name of the alert that is used for the test steps logging.
	 */
	public void dismissAlert(ExtentTest test,String alertName);
}
