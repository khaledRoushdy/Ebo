package com.github.khaledroushdy.elements;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.github.khaledroushdy.browser.ActionDriver;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.browser.JavascriptDriver;
import com.github.khaledroushdy.browser.WaitDriver;

public class Elements<T extends Element> implements IListGetTextable, IMouseMoveable, IElementsActions {

	protected By byLocator;
	protected Driver driver;
	protected JavascriptDriver jsDriver;
	protected WaitDriver waitDriver;
	protected ActionDriver actionDriver;
	protected List<WebElement> webElements;
	private Class<T> type;

	public Elements(By byLocator, Driver driver, Class<T> type) {
		this.byLocator = byLocator;
		this.driver = driver;
		jsDriver = new JavascriptDriver();
		waitDriver = new WaitDriver(40);
		actionDriver = new ActionDriver();
		webElements = new ArrayList<WebElement>();
		this.type = type;
	}

	public T getInstanceOfT() {
		try {
			return type.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	protected List<WebElement> getElements() {
		WebDriver webdriver = driver.getWebdriver();
		waitDriver.waitForElementToBePresent(byLocator, webdriver);
		return webdriver.findElements(byLocator);
	}

	public void getElement() {

	}

	@Override
	public List<String> getAllElementsText() {
		List<String> listoFtext = new ArrayList<String>();
		List<WebElement> elements = getElements();
		for (WebElement webElement : elements) {
			listoFtext.add(webElement.getText());
		}
		return listoFtext;
	}

	@Override
	public List<String> getAllElementsTextUsingJs() {
		List<String> listoFtext = new ArrayList<String>();
		List<WebElement> elements = getElements();
		for (WebElement webelement : elements) {
			String text = jsDriver.executeJsScript("eturn arguments[0].text", driver.getWebdriver(), webelement)
					.toString();
			listoFtext.add(text);
		}
		return listoFtext;
	}

	@Override
	public List<String> getAllElementsText(ExtentTest test, String elementName) {
		List<String> listoFtext = new ArrayList<String>();
		List<WebElement> elements = getElements();
		for (WebElement webElement : elements) {
			test.log(Status.INFO, "\"" + webElement.getText() + "\"" + " has been got from " + elementName + " list");
			listoFtext.add(webElement.getText());
		}
		return listoFtext;
	}

	@Override
	public List<String> getAllElementsTextUsingJs(ExtentTest test, String elementName) {
		List<String> listoFtext = new ArrayList<String>();
		List<WebElement> elements = getElements();
		for (WebElement webelement : elements) {
			String text = jsDriver.executeJsScript("eturn arguments[0].text", driver.getWebdriver(), webelement)
					.toString();
			test.log(Status.INFO, "\"" + text + "\"" + " has been got from " + elementName + " list");
			listoFtext.add(text);
		}
		return listoFtext;
	}

	@Override
	public void moveToElement() {
		actionDriver.moveToElement(driver.getWebdriver(), getElements().get(0));
	}

	@Override
	public void moveToElement(int x, int y) {
		actionDriver.moveToElement(driver.getWebdriver(), getElements().get(0), x, y);
	}

	@Override
	public boolean areAllElementsEnabled() {
		List<WebElement> elements = getElements();
		for (WebElement webElement : elements) {
			if (!webElement.isEnabled())
				return false;
		}
		return true;
	}

	@Override
	public boolean areAllElementsDisplayed() {
		List<WebElement> elements = getElements();
		for (WebElement webElement : elements) {
			if (!webElement.isDisplayed())
				return false;
		}
		return true;
	}

	@Override
	public boolean areAllElementsSelected() {
		List<WebElement> elements = getElements();
		for (WebElement webElement : elements) {
			if (!webElement.isSelected())
				return false;
		}
		return true;
	}

	@Override
	public List<String> getAllElementsCssValue(String propertyName) {
		List<String> listoFcssValues = new ArrayList<String>();
		List<WebElement> elements = getElements();
		for (WebElement webElement : elements) {
			listoFcssValues.add(webElement.getCssValue(propertyName));
		}
		return listoFcssValues;
	}

	@Override
	public List<String> getAllElementsAttributeValue(String attributeName) {
		List<String> listoFAttributeValues = new ArrayList<String>();
		List<WebElement> elements = getElements();
		for (WebElement webElement : elements) {
			listoFAttributeValues.add(webElement.getAttribute(attributeName));
		}
		return listoFAttributeValues;
	}

	@Override
	public int getElementsSize() {
		return getElements().size();
	}
}
