package com.automation.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface IActionable {

	public void click(WebDriver driver,WebElement element);
	public void clickAndHold(WebDriver driver,WebElement element);
	public void contextClick(WebDriver driver,WebElement element);
	public void doubleClick(WebDriver driver,WebElement element);
	public void dragAndDrop(WebDriver driver,WebElement element,WebElement target);
	public void dragAndDropBy(WebDriver driver,WebElement element,int x,int y);
	public void moveToElement(WebDriver driver,WebElement element);
	public void moveToElement(WebDriver driver,WebElement element,int x,int y);
	public void moveByOffset(WebDriver driver,int x,int y);
}
