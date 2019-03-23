package com.automation.jsonParser;

 public enum LocatorTypes {

	ID("id"),
	NAME("name"),
	XPATH("xpath"),
	CSS_SELECTOR("cssSelector"),
	LINK_TEXT("linkText"),
	PARTIAL_LINK_TEXT("partialLinkText"),
	TAG_NAME("tagName");
	
	private final String locator;
	
	private LocatorTypes(final String locator) {
		this.locator = locator;
	}
	
	public String getLocator() {
		return locator;
	}
	
}
