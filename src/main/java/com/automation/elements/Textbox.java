package com.automation.elements;

import org.openqa.selenium.By;
import com.automation.browser.Driver;

public class Textbox extends InputElement implements ITextable {

	public Textbox(By byLocator, Driver driver) {
		super(byLocator, driver);
	}
}
