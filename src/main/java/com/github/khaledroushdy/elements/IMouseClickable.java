package com.github.khaledroushdy.elements;

import com.aventstack.extentreports.ExtentTest;

public interface IMouseClickable {

	/**
	 * clicks on the web element using the action driver.
	 * 
	 */
	public void clickUsingActions();

	/**
	 * clicks on the web element using the action driver and log the click action.
	 * 
	 * @param elementName is the name of the element that will be shown in the
	 *                    report.
	 * @param test        is the test case from the extent report to log your test
	 *                    steps.
	 */
	public void clickUsingActions(String elementName, ExtentTest test);

	/**
	 * clicks and holds the web element.
	 * 
	 */
	public void clickAndHold();

	/**
	 * clicks and holds the web element.
	 * 
	 * @param elementName is the name of the element that will be shown in the
	 *                    report.
	 * @param test        is the test case from the extent report to log your test
	 *                    steps.
	 */
	public void clickAndHold(String elementName, ExtentTest test);

	/**
	 * perform right click on the web element.
	 * 
	 */
	public void contextClick();

	/**
	 * perform right click on the web element.
	 * 
	 * @param elementName is the name of the element that will be shown in the
	 *                    report.
	 * @param test        is the test case from the extent report to log your test
	 *                    steps.
	 */
	public void contextClick(String elementName, ExtentTest test);

	/**
	 * perform double click on the web element.
	 * 
	 */
	public void doubleClick();

	/**
	 * perform double click on the web element.
	 * 
	 * @param elementName is the name of the element that will be shown in the
	 *                    report.
	 * @param test        is the test case from the extent report to log your test
	 *                    steps.
	 */
	public void doubleClick(String elementName, ExtentTest test);

}
