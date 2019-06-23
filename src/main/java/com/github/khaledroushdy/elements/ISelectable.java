package com.github.khaledroushdy.elements;

import com.aventstack.extentreports.ExtentTest;

public interface ISelectable {

	/**
	 * select text from list of web elements.
	 * 
	 * @param text is the text to be selected.
	 */
	public void selectByVisibleText(String text);

	/**
	 * deselect text from list of web elements.
	 * 
	 * @param text is the input for the web element.
	 */
	public void deselectByVisibleText(String text);

	/**
	 * select text by index from list of web elements.
	 * 
	 * @param index is the index of the web element.
	 */
	public void selectByIndex(int index);

	/**
	 * deselect text by index from list of web elements.
	 * 
	 * @param index is the index of the web element.
	 */
	public void deselectByIndex(int index);

	/**
	 * select text by value from list of web elements.
	 * 
	 * @param value is the value of the web element.
	 */
	public void selectByValue(String value);

	/**
	 * select text by value from list of web elements.
	 * 
	 * @param value is the value of the web element.
	 */
	public void deselectByValue(String value);

	/**
	 * checks whether the list is multiselected or not.
	 * 
	 * @return boolean indicating whether is multiselected or not.
	 */
	public boolean isMultiple();

	/**
	 * select text from list of web elements.
	 * 
	 * @param text         is the text to be selected.
	 * @param dropDownName is the name of the dropdown that will be shown in the
	 *                     report.
	 * @param test         is the test case from the extent report to log your test
	 *                     steps.
	 */
	public void selectByVisibleText(String text, String dropDownName, ExtentTest test);

	/**
	 * deselect text from list of web elements.
	 * 
	 * @param text         is the input for the web element.
	 * @param dropDownName is the name of the dropdown that will be shown in the
	 *                     report.
	 * @param test         is the test case from the extent report to log your test
	 *                     steps.
	 */
	public void deselectByVisibleText(String text, String dropDownName, ExtentTest test);

	/**
	 * select text by index from list of web elements.
	 * 
	 * @param index        is the index of the web element.
	 * @param dropDownName is the name of the dropdown that will be shown in the
	 *                     report.
	 * @param test         is the test case from the extent report to log your test
	 *                     steps.
	 */
	public void selectByIndex(int index, String dropDownName, ExtentTest test);

	/**
	 * deselect text by index from list of web elements.
	 * 
	 * @param index        is the index of the web element.
	 * @param dropDownName is the name of the dropdown that will be shown in the
	 *                     report.
	 * @param test         is the test case from the extent report to log your test
	 *                     steps.
	 */
	public void deselectByIndex(int index, String dropDownName, ExtentTest test);

	/**
	 * select text by value from list of web elements.
	 * 
	 * @param value        is the value of the web element.
	 * @param dropDownName is the name of the dropdown that will be shown in the
	 *                     report.
	 * @param test         is the test case from the extent report to log your test
	 *                     steps.
	 */
	public void selectByValue(String value, String dropDownName, ExtentTest test);

	/**
	 * deselect text by value from list of web elements.
	 * 
	 * @param value        is the value of the web element.
	 * @param dropDownName is the name of the dropdown that will be shown in the
	 *                     report.
	 * @param test         is the test case from the extent report to log your test
	 *                     steps.
	 */
	public void deselectByValue(String value, String dropDownName, ExtentTest test);

}
