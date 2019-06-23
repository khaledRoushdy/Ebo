package com.github.khaledroushdy.browser;

import org.apache.poi.ss.formula.eval.NotImplementedException;
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
	public void dragAndDrop(WebDriver driver,WebElement element,WebElement target){
		getActionDriver(driver).dragAndDrop(element, target).build().perform();
	}

	@Override
	public void dragAndDropBy(WebDriver driver,WebElement element,int x,int y) {
		getActionDriver(driver).dragAndDropBy(element, x, y);
	}

	@Override
	public void moveToElement(WebDriver driver,WebElement element) {
		getActionDriver(driver).moveToElement(element).perform();
	}

	@Override
	public void moveByOffset(WebDriver driver,int x,int y) {
		getActionDriver(driver).moveByOffset(x, y);
	}

	@Override
	public void clickAndHold(WebDriver driver, WebElement element) {
		getActionDriver(driver).clickAndHold(element).perform();
	}

	@Override
	public void contextClick(WebDriver driver, WebElement element) {
		getActionDriver(driver).contextClick(element).perform();
	}

	@Override
	public void moveToElement(WebDriver driver, WebElement element, int x, int y) {
		getActionDriver(driver).moveToElement(element, x, y);
	}
}
