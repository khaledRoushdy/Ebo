package com.github.khaledroushdy.elements;

import java.util.List;

public interface IElementsActions {

	/**
	 * checks whether the web elements are enabled or not
	 * 
	 * @return boolean indicating if the elements are enabled or not
	 */
	public boolean areAllElementsEnabled();

	/**
	 * checks whether the web elements are displayed or not
	 * 
	 * @return boolean indicating if the elements are displayed or not
	 */
	public boolean areAllElementsDisplayed();

	/**
	 * checks whether the web elements are selected or not
	 * 
	 * @return boolean indicating if the elements are selected or not
	 */
	public boolean areAllElementsSelected();

	/**
	 * gets the css value of the web elements.
	 * 
	 * @param propertyName is name of the property (Example:class)
	 * @return list of the css values
	 */
	public List<String> getAllElementsCssValue(String propertyName);

	/**
	 * gets the attribute name of the web elements.
	 * 
	 * @param attributeName is name of the attribute (Example:class,href)
	 * @return list of the attribute values.
	 */
	public List<String> getAllElementsAttributeValue(String attributeName);

	/**
	 * gets the size of the web elements.
	 * 
	 * @return the length of list of web elements.
	 */
	public int getElementsSize();
}
