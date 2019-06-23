package com.github.khaledroushdy.elements;

import com.aventstack.extentreports.ExtentTest;

public interface ITextable {

	/**
	 * enter text in the web element.
	 * 
	 * @param text is the input for the web element.
	 */
	public void enterText(String text);

	/**
	 * enter text in the web element using the javascript executor.
	 * 
	 * @param text is the input for the web element.
	 */
	public void enterTextUsingJs(String text);

	/**
	 * enter text in the web element
	 * 
	 * @param text        is the input for the web element.
	 * @param elementName is the name of the element name that will be shown in the
	 *                    report.
	 * @param test        is the test case from the extent report to log your test
	 *                    steps.
	 */
	public void enterText(String text, String elementName, ExtentTest test);
}
