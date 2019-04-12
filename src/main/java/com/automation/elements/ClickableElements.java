package com.automation.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automation.browser.Driver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public abstract class ClickableElements extends Element implements IClickable, IMouseClickable, IMouseMoveable {
	public ClickableElements(By byLocator, Driver driver) {
		super(byLocator, driver);
	}

	public List<WebElement> getClickableElements() {
		return getElements();
	}

	public void getTextOfElements() {
		List<WebElement> elements = getElements();
		for (WebElement webElement : elements) {
			webElement.getText();
		}
	}

	@Override
	public void clickOnIt() {
		getElement().click();
	}

	public void clickOnAllElements() {
		List<WebElement> elements = getElements();
		for (WebElement webElement : elements) {
			webElement.click();
		}
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
	public void moveByOffset() {

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
}
