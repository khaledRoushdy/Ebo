package com.automation.elements;

public interface IElementActions {

	/**
	 * checks whether the web element is enabled or not
	 * 
	 * @return boolean indicating is enabled or not
	 */
	public boolean isEnabled();

	/**
	 * checks whether the web element is displayed or not
	 * 
	 * @return boolean indicating is displayed or not
	 */
	public boolean isDisplayed();

	/**
	 * checks whether the web element is selected or not
	 * 
	 * @return boolean indicating is selected or not
	 */
	public boolean isSelected();

	/**
	 * gets the css value of the web element.
	 * 
	 * @param propertyName is name of the property (Example:class)
	 * @return the css value
	 */
	public String getCssValue(String propertyName);

	/**
	 * gets the attribute value of the web element.
	 * 
	 * @param attributeName is name of the attribute (Example:class,href)
	 * @return the attribute value
	 */
	public String getValueOfAnyAttribute(String attributeName);

	/**
	 * gets the height of the web element
	 * 
	 * @return the height of web element
	 */
	public int getElementHeight();

	/**
	 * gets the width of the web element
	 * 
	 * @return the width of web element
	 */
	public int getElementWidth();
}
