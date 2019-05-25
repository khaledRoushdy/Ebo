package com.automation.selectelements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.automation.browser.Driver;
import com.automation.elements.Element;
import com.automation.elements.IMouseMoveable;
import com.automation.elements.ISelectable;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class DropDownList extends Element implements ISelectable,IMouseMoveable {

	public DropDownList(By byLocator, Driver driver) {
		super(byLocator, driver);
	}

	private Select getSelect() {
		return new Select(getElement());
	}

	@Override
	public void selectByVisibleText(String text) {
		getSelect().selectByVisibleText(text);
	}

	@Override
	public void deselectByVisibleText(String text) {
		getSelect().deselectByVisibleText(text);
	}

	@Override
	public void selectByIndex(int index) {
		getSelect().selectByIndex(index);
	}

	@Override
	public void deselectByIndex(int index) {
		getSelect().deselectByIndex(index);
	}

	@Override
	public void selectByValue(String value) {
		getSelect().selectByValue(value);
	}

	@Override
	public void deselectByValue(String value) {
		getSelect().deselectByValue(value);
	}

	@Override
	public boolean isMultiple() {
		return getSelect().isMultiple();
	}

	@Override
	public void selectByVisibleText(String text, String dropDownName, ExtentTest test) {
		getSelect().selectByVisibleText(text);
		test.log(Status.INFO, text + " has been selected from " + dropDownName);
	}

	@Override
	public void deselectByVisibleText(String text, String dropDownName, ExtentTest test) {
		getSelect().deselectByVisibleText(text);
		test.log(Status.INFO, text + " has been deselected from " + dropDownName);
	}

	@Override
	public void selectByIndex(int index, String dropDownName, ExtentTest test) {
		getSelect().selectByIndex(index);
		test.log(Status.INFO, "item with index " + index + "has been selected from " + dropDownName);
	}

	@Override
	public void deselectByIndex(int index, String dropDownName, ExtentTest test) {
		getSelect().deselectByIndex(index);
		test.log(Status.INFO, "item with index " + index + "has been deselected from " + dropDownName);
	}

	@Override
	public void selectByValue(String value, String dropDownName, ExtentTest test) {
		getSelect().selectByValue(value);
		test.log(Status.INFO, "item with value " + value + "has been deselected from " + dropDownName);
	}

	@Override
	public void deselectByValue(String value, String dropDownName, ExtentTest test) {
		getSelect().deselectByValue(value);
		test.log(Status.INFO, "item with value " + value + "has been deselected from " + dropDownName);
	}
}
