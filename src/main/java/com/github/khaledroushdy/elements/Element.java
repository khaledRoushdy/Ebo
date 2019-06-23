package com.github.khaledroushdy.elements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.khaledroushdy.browser.ActionDriver;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.browser.JavascriptDriver;
import com.github.khaledroushdy.browser.WaitDriver;

public abstract class Element implements IElementActions, IMouseMoveable {

	protected By byLocator;
	protected Driver driver;
	protected JavascriptDriver jsDriver;
	protected WaitDriver waitDriver;
	protected ActionDriver actionDriver;
	protected List<WebElement> webElements;

	public Element(By byLocator, Driver driver) {
		this.byLocator = byLocator;
		this.driver = driver;
		jsDriver = new JavascriptDriver();
		waitDriver = new WaitDriver(40);
		actionDriver = new ActionDriver();
		webElements = new ArrayList<WebElement>();
	}

	protected WebElement getElement() {
		WebDriver webdriver = driver.getWebdriver();
		waitDriver.waitForElementToBePresent(byLocator, webdriver);
		return webdriver.findElement(byLocator);
	}

	@Override
	public boolean isEnabled() {
		return getElement().isEnabled();
	}

	@Override
	public boolean isDisplayed() {
		return getElement().isDisplayed();
	}

	@Override
	public boolean isSelected() {
		return getElement().isSelected();
	}

	@Override
	public String getCssValue(String propertyName) {
		return getElement().getCssValue(propertyName);
	}

	@Override
	public String getValueOfAnyAttribute(String attributeName) {
		return getElement().getAttribute(attributeName);
	}

	@Override
	public int getElementHeight() {
		return getElement().getSize().height;
	}

	@Override
	public int getElementWidth() {
		return getElement().getSize().width;
	}

	@Override
	public void moveToElement() {
		actionDriver.moveToElement(driver.getWebdriver(), getElement());
	}

	@Override
	public void moveToElement(int x, int y) {
		actionDriver.moveToElement(driver.getWebdriver(), getElement(), x, y);
	}

}
