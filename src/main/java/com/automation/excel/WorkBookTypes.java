package com.automation.excel;

public enum WorkBookTypes {

	XSSF("xssf"),
	HSSF("hssf");
	
	private final String type;
	
	private WorkBookTypes(final String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
