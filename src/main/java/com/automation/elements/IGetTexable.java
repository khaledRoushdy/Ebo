package com.automation.elements;

import com.aventstack.extentreports.ExtentTest;

public interface IGetTexable {

	/**
	 * gets the text of the web element.
	 * 
	 * @return a string contains the text of web element
	 */
	public String getText();

	/**
	 * gets the text of the web element using the javascript executor.
	 * 
	 * @return a string contains the text of web element.
	 */
	public String getTextUsingJs();

	/**
	 * gets the value of the attribute.
	 * 
	 * @return a string contains the attribute value.
	 */
	public String getAttributeValue();

	/**
	 * gets the value of the attribute.
	 * 
	 * @param test        is the test case from the extent report to log your test
	 *                    steps.
	 * @param elementName is the name of the element that will be shown in the
	 *                    report.
	 * 
	 * @return a string contains the attribute value.
	 */
	public String getAttributeValue(ExtentTest test, String elementName);

	/**
	 * gets the text of the web element.
	 * 
	 * @param test        is the test case from the extent report to log your test
	 *                    steps.
	 * @param elementName is the name of the element that will be shown in the
	 *                    report.
	 * 
	 * @return a string contains the text of web element
	 */
	public String getText(ExtentTest test, String elementName);

	/**
	 * gets the text of the web element using the javascript executor.
	 * 
	 * @param test        is the test case from the extent report to log your test
	 *                    steps.
	 * @param elementName is the name of the element that will be shown in the
	 *                    report.
	 * 
	 * @return a string contains the text of web element
	 */
	public String getTextUsingJs(ExtentTest test, String elementName);
}
