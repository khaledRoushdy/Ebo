package com.github.khaledroushdy.jsonParser;

public class WebElement {

	private String name;
	private String value;
	private String locatorType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLocator() {
		return locatorType;
	}

	public void setLocator(String locator) {
		this.locatorType = locator;
	}
}
