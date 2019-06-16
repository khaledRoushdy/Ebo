package com.automation.elements;

public interface IMouseMoveable {

	/**
	 * scroll until a specific element.
	 * 
	 */
	public void moveToElement();
	/**
	 * scroll until a specific element by using it's offset.
	 * 
	 * @param x is the x-axis
	 * @param y is the y-axis
	 */
	public void moveToElement(int x,int y);
}
