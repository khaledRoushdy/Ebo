package com.github.khaledroushdy.elements;

import com.aventstack.extentreports.ExtentTest;

public interface IClickable {

	/**
	 * clicks on the web element.
	 *
	 */
	public void clickOnIt();
	/**
	 * clicks on the web element using the javascript executor.
	 *
	 */
	public void clickOnItUsingJs();

	/**
	 * clicks on the web element and log the click action.
	 * 
	 * @param elementName is the name of the element that will be shown in the
	 *                    report.
	 * @param test        is the test case from the extent report to log your test
	 *                    steps.
	 */
	public void clickOnIt(String elementName,ExtentTest test);
	/**
	 * clicks on the web element using javascript executor and logs the click action.
	 * 
	 * @param elementName is the name of the element that will be shown in the report.
	 * @param test is the test case from the extent report to log your test steps.
	 */
	public void clickOnItUsingJs(String elementName,ExtentTest test);
}
