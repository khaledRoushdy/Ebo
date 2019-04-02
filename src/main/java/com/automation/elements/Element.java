package com.automation.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Element {

	protected By byLocator;
	protected WebDriver driver;
	
	public Element(By byLocator,WebDriver driver) {
		this.byLocator = byLocator;
		this.driver = driver;
	}
	
	protected WebElement getElement() {
		return driver.findElement(byLocator);
	}
	
}
