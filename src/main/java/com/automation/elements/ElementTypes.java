package com.automation.elements;

public enum ElementTypes {

	ALERT("alert"),
	TEXTBOX("textbox"),
	SPAN("span"),
	FRAME("frame"),
	HYPERLINK("hyperLink"),
	BUTTON("button"),
	DROPDOWNLIST("dropdownlist"),
	CHECKBOX("checkbox"),
	TEXTAREA("textarea"),
	DIV("div"),
	TABLEROW("tr"),
	TABLEDATA("td"),
	TABLECOLUMN("tablecolumn"),
	TABLEHEADER("tableheader"),
	TABLE("table"),
	IMAGE("image"),
	LABEL("label"),
	LISTITEM("listitem"),
	ORDEREDLIST("orderedlist"),
	UNORDEREDLIST("unorderedlist");
	
	private final String type;

	private ElementTypes(final String type) {
		this.type = type;
	}
	
	public String getLocator() {
		return type;
	}
}
