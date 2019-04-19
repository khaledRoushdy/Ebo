package com.automation.elements.inputelements;

import org.openqa.selenium.By;
import com.automation.browser.Driver;
import com.automation.elements.ITextable;

public class Textbox extends InputElement implements ITextable {

	public Textbox(By byLocator, Driver driver) {
		super(byLocator, driver);
	}
}
