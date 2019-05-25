package com.automation.elements;

public interface IElementActions {

	public boolean isEnabled();
	public boolean isDisplayed();
	public boolean isSelected();
	public String getCssValue(String propertyName);
	public String getAttributeValue(String attributeName);
	public int getElementHeight();
	public int getElementWidth();
}
