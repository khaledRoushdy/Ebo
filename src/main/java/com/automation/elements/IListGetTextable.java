package com.automation.elements;

import java.util.List;

import com.aventstack.extentreports.ExtentTest;

public interface IListGetTextable {

	/**
	 * gets on the text of each web element.
	 * 
	 * @return a list of the texts
	 *
	 */
	public List<String> getAllElementsText();

	/**
	 * gets on the text of each web element using the javascript executor.
	 * 
	 * @return a list of the texts
	 */
	public List<String> getAllElementsTextUsingJs();

	/**
	 * gets on the text of each web element.
	 *
	 * @param elementName is the name of the element that will be shown in the
	 *                    report.
	 * @param test        is the test case from the extent report to log your test
	 *                    steps.
	 * @return a list of the texts
	 */
	public List<String> getAllElementsText(ExtentTest test, String elementName);

	/**
	 * gets on the text of each web element using the javascript executor.
	 *
	 * @param elementName is the name of the element that will be shown in the
	 *                    report.
	 * @param test        is the test case from the extent report to log your test
	 *                    steps.
	 * @return a list of the texts
	 */
	public List<String> getAllElementsTextUsingJs(ExtentTest test, String elementName);
}
