package com.automation.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.browser.Driver;

public abstract class Element {

	protected By byLocator;
	protected Driver driver;
	
	public Element(By byLocator,Driver driver) {
		this.byLocator = byLocator;
		this.driver = driver;
	}
	
	protected WebElement getElement() {
		WebDriver webdriver= driver.getWebdriver();
		WebDriverWait wait = new WebDriverWait(webdriver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(byLocator));
		return webdriver.findElement(byLocator);
	}
}
