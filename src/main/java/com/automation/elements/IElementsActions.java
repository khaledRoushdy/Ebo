package com.automation.elements;

import java.util.List;

public interface IElementsActions {


	public boolean areAllElementsEnabled();
	public boolean areAllElementsDisplayed();
	public boolean areAllElementsSelected();
	public List<String> getAllElementsCssValue(String propertyName);
	public List<String> getAllElementsAttributeValue(String attributeName);
	public int getElementsSize();
}
