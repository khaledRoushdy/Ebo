package com.github.khaledroushdy.elements.inputelements;

import org.openqa.selenium.By;

import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.elements.ITextable;

public class Textbox extends InputElement implements ITextable {

	public Textbox(By byLocator, Driver driver) {
		super(byLocator, driver);
	}
}
