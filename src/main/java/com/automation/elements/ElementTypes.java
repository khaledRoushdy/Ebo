package com.automation.elements;

public enum ElementTypes {

	TEXTBOX("textbox"),
	SPAN("span"),
	HYPERLINK("hyperLink"),
	BUTTON("button"),
	DROPDOWNLIST("dropdownlist");
	
	private final String type;

	private ElementTypes(final String type) {
		this.type = type;
	}
	
	public String getLocator() {
		return type;
	}
}
