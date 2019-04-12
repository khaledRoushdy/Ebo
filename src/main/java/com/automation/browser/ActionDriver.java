package com.automation.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionDriver implements IActionable{

	private Actions action;
	
	public Actions getActionDriver(WebDriver driver) {
		action = new Actions(driver);
		return action;
	}
	
	public void doubleClick(WebDriver driver,WebElement element) {
		getActionDriver(driver).doubleClick(element).perform();
	}

	@Override
	public void click(WebDriver driver,WebElement element) {
		getActionDriver(driver).click(element).perform();
	}

	@Override
	public void dragAndDrop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragAndRopBy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveToElement(WebDriver driver,WebElement element) {
		// TODO Auto-generated method stub
		getActionDriver(driver).moveToElement(element).perform();
	}

	@Override
	public void moveByOffset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickAndHold(WebDriver driver, WebElement element) {
		getActionDriver(driver).clickAndHold(element).perform();
	}

	@Override
	public void contextClick(WebDriver driver, WebElement element) {
		getActionDriver(driver).contextClick(element).perform();
	}
}
