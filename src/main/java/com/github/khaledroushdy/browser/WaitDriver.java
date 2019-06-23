package com.github.khaledroushdy.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDriver implements IWaitable {

	private WebDriverWait webDriverWait;
	private int numberOfSeconds;

	public WaitDriver(int numberOfSeconds) {
		this.numberOfSeconds = numberOfSeconds;
	}

	public WebDriverWait getWebDriverWait(WebDriver driver) {
		webDriverWait = new WebDriverWait(driver, numberOfSeconds);
		return webDriverWait;
	}

	@Override
	public void waitForElementToBePresent(By byLocator, WebDriver driver) {
		getWebDriverWait(driver).until(ExpectedConditions.presenceOfElementLocated(byLocator));
	}

	@Override
	public void waitForElemetToBeClicable(By byLocator, WebDriver driver) {
		getWebDriverWait(driver).until(ExpectedConditions.elementToBeClickable(byLocator));
	}

	@Override
	public void waitForAlertToBePresent(WebDriver driver) {
		getWebDriverWait(driver).until(ExpectedConditions.alertIsPresent());
	}

	@Override
	public void waitAndSwitchToFrame(By byLocator, WebDriver driver) {
		getWebDriverWait(driver).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(byLocator));
	}

	@Override
	public void waitAndSwitchToFrame(WebElement elementLocator, WebDriver driver) {
		getWebDriverWait(driver).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(elementLocator));
	}

	@Override
	public void waitForElementToBeInvisible(WebDriver driver, By byLocator) {
		getWebDriverWait(driver).until(ExpectedConditions.invisibilityOfElementLocated(byLocator));
	}

	@Override
	public void waitAndSwitchToFrame(String frameName, WebDriver driver) {
		getWebDriverWait(driver).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
	}

	@Override
	public void waitAndSwitchToFrame(int frameIndex, WebDriver driver) {
		getWebDriverWait(driver).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
}
