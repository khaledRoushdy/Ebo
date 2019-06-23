package com.github.khaledroushdy.elements;

public enum WebElementTypes {

	Single("single"),
	List("list");

	private final String type;

	private WebElementTypes(final String type) {
		this.type = type;
	}
	
	public String getWebElementType() {
		return type;
	}
}
