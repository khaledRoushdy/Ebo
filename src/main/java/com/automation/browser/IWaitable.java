package com.automation.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface IWaitable {

	public void waitForElementToBePresent(By byLocator,WebDriver driver) ;
	
	public void waitForElemetToBeClicable(By byLocator,WebDriver driver) ;
	
	public void waitForAlertToBePresent(WebDriver driver);
	
	public void waitAndSwitchToFrame(By byLocator,WebDriver driver);
	
	public void waitAndSwitchToFrame(WebElement elementLocator,WebDriver driver);
	
	public void waitForElementToBeInvisible(WebDriver driver,By byLocator);
	
	public void waitAndSwitchToFrame(String frameName,WebDriver driver);
	
	public void waitAndSwitchToFrame(int frameIndex,WebDriver driver);
}
