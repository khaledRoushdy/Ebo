package com.github.khaledroushdy.jsonParser;

import org.openqa.selenium.By;

public class LocatorFactory {

	// private static final String = null;

	public static By createLocator(WebElement element) {
	
		By by = null;	
		String locator = element.getLocator();
		if(locator.equalsIgnoreCase((LocatorTypes.ID.getLocator()))){
			by = By.id(element.getValue().toLowerCase());
		}
		else if(locator.equalsIgnoreCase(LocatorTypes.NAME.getLocator())) {
			by = By.name(element.getValue().toLowerCase());
		}
		else if(locator.equalsIgnoreCase(LocatorTypes.CSS_SELECTOR.getLocator())) {
			by = By.cssSelector(element.getValue().toLowerCase());
		}
		else if(locator.equalsIgnoreCase(LocatorTypes.XPATH.getLocator())) {
			by = By.xpath(element.getValue().toLowerCase());
		}
		else if(locator.equalsIgnoreCase(LocatorTypes.LINK_TEXT.getLocator())) {
			by = By.linkText(element.getValue().toLowerCase());
		}
		else if(locator.equalsIgnoreCase(LocatorTypes.PARTIAL_LINK_TEXT.getLocator())) {
			by = By.partialLinkText(element.getValue().toLowerCase());
		}
		else if(locator.equalsIgnoreCase(LocatorTypes.TAG_NAME.getLocator())) {
			by = By.tagName(element.getValue().toLowerCase());
		}		
		
//		for(LocatorTypes type : LocatorTypes.values()) {
//			String locator = element.getLocator();
//			//String y = type.NAME.name();
//			if(locator.equalsIgnoreCase((type.ID.getLocator()))){
//				by = By.id(element.getValue().toLowerCase());
//				break;
//			}
//			else if(locator.equalsIgnoreCase(type.NAME.getLocator())) {
//				by = By.name(element.getValue().toLowerCase());
//				break;
//			}
//			else if(locator.equalsIgnoreCase(type.CSS_SELECTOR.getLocator())) {
//				by = By.cssSelector(element.getValue().toLowerCase());
//				break;
//			}
//			else if(locator.equalsIgnoreCase(type.XPATH.getLocator())) {
//				by = By.xpath(element.getValue().toLowerCase());
//				break;
//			}
//			else if(locator.equalsIgnoreCase(type.LINK_TEXT.getLocator())) {
//				by = By.linkText(element.getValue().toLowerCase());
//				break;
//			}
//			else if(locator.equalsIgnoreCase(type.PARTIAL_LINK_TEXT.getLocator())) {
//				by = By.partialLinkText(element.getValue().toLowerCase());
//				break;
//			}
//			else if(locator.equalsIgnoreCase(type.TAG_NAME.getLocator())) {
//				by = By.tagName(element.getValue().toLowerCase());
//				break;
//			}		
//		}
		return by;

	}
}
