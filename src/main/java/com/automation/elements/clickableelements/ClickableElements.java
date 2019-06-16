package com.automation.elements.clickableelements;

import org.openqa.selenium.By;
import com.automation.browser.Driver;
import com.automation.elements.Element;
import com.automation.elements.IClickable;
import com.automation.elements.IGetTexable;
import com.automation.elements.IMouseClickable;
import com.automation.elements.IMouseMoveable;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public abstract class ClickableElements extends Element implements IClickable, IMouseClickable, IMouseMoveable,IGetTexable {
	public ClickableElements(By byLocator, Driver driver) {
		super(byLocator, driver);
	}

	@Override
	public void clickOnIt() {
		getElement().click();
	}
	
	@Override
	public void clickOnItUsingJs() {
		jsDriver.executeJsScript("arguments[0].click();", driver.getWebdriver(), getElement());
	}

	@Override
	public void clickOnIt(String elementName, ExtentTest test) {
		getElement().click();
		test.log(Status.INFO, elementName + " has been clicked");
	}

	@Override
	public void clickOnItUsingJs(String elementName, ExtentTest test) {
		jsDriver.executeJsScript("arguments[0].click();", driver.getWebdriver(), getElement());
		test.log(Status.INFO, elementName + " has been clicked");
	}

	@Override
	public void clickUsingActions() {
		actionDriver.click(driver.getWebdriver(), getElement());
	}

	@Override
	public void clickAndHold() {
		actionDriver.clickAndHold(driver.getWebdriver(), getElement());
	}

	@Override
	public void contextClick() {
		actionDriver.contextClick(driver.getWebdriver(), getElement());
	}

	@Override
	public void doubleClick() {
		actionDriver.doubleClick(driver.getWebdriver(), getElement());
	}

	@Override
	public void moveToElement() {
		actionDriver.moveToElement(driver.getWebdriver(), getElement());
	}

	@Override
	public void clickUsingActions(String elementName, ExtentTest test) {
		actionDriver.click(driver.getWebdriver(), getElement());
		test.log(Status.INFO, elementName + " has been clicked");
	}

	@Override
	public void clickAndHold(String elementName, ExtentTest test) {
		actionDriver.clickAndHold(driver.getWebdriver(), getElement());
		test.log(Status.INFO, elementName + " has been clicked and holded");
	}

	@Override
	public void contextClick(String elementName, ExtentTest test) {
		actionDriver.contextClick(driver.getWebdriver(), getElement());
		test.log(Status.INFO, elementName + " has been right clicked");
	}

	@Override
	public void doubleClick(String elementName, ExtentTest test) {
		actionDriver.doubleClick(driver.getWebdriver(), getElement());
		test.log(Status.INFO, elementName + " has been double clicked");
	}
	
	@Override
	public String getText() {
		return getElement().getText();
	}

	@Override
	public String getTextUsingJs() {
		return jsDriver.executeJsScript("return arguments[0].text", driver.getWebdriver(), getElement()).toString();
	}

	@Override
	public String getText(ExtentTest test, String elementName) {
		String text = getElement().getText();
		test.log(Status.INFO, text + " has been gotten from " + elementName);
		return text;
	}

	@Override
	public String getTextUsingJs(ExtentTest test, String elementName) {
		String text = jsDriver.executeJsScript("return arguments[0].text", driver.getWebdriver(), getElement())
				.toString();
		test.log(Status.INFO, text + " has been gotten from " + elementName);
		return text;
	}

	@Override
	public String getAttributeValue() {
		String attributeValue = getElement().getAttribute("value");
		return attributeValue;
	}

	@Override
	public String getAttributeValue(ExtentTest test, String elementName) {
		String attributeValue = getElement().getAttribute("value");
		test.log(Status.INFO, attributeValue + " has been gotten from " + elementName);
		return attributeValue;
	}
}
