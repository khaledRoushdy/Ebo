package com.automation.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface IActionable {

	public void click(WebDriver driver,WebElement element);
	public void clickAndHold(WebDriver driver,WebElement element);
	public void contextClick(WebDriver driver,WebElement element);
	public void doubleClick(WebDriver driver,WebElement element);
	public void dragAndDrop();
	public void dragAndRopBy();
	public void moveToElement(WebDriver driver,WebElement element);
	public void moveByOffset();
}
