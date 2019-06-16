package com.automation.browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Driver implements IDriveable {

	private WebDriver webdriver;
	private JavascriptDriver jsDriver;
	private WaitDriver waitDriver;
	private ActionDriver actionDriver;

	/**
	 * Driver constructor.
	 * 
	 * @param driverName     is the name of the driver which can be found in
	 *                       DriverTypes enum.
	 * @param driverLocation is the location of the driver.
	 */
	public Driver(String driverName, String driverLocation) {
		this.webdriver = setDriver(driverName, driverLocation);
		jsDriver = new JavascriptDriver();
		waitDriver = new WaitDriver(40);
		actionDriver = new ActionDriver();
	}

	/**
	 * gets the webdriver
	 * 
	 * @return WebDriver instance in case you don't want to use the wrapped driver.
	 */
	public WebDriver getWebdriver() {
		return webdriver;
	}

	private WebDriver setDriver(String name, String location) {

		switch (name.toLowerCase()) {

		case DriverTypes.IE:
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setBrowserName("internet explorer");
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			caps.setCapability("ignoreZoomSetting", true);
			caps.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
			caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
			System.setProperty("webdriver.ie.driver", location);
			webdriver = new InternetExplorerDriver();
			break;

		case DriverTypes.Chrome:
			System.setProperty("webdriver.chrome.driver", location);
			webdriver = new ChromeDriver();
			break;

		case DriverTypes.FireFox:
			System.setProperty("webdriver.gecko.driver", location);
			webdriver = new FirefoxDriver();
			break;
		}
		return webdriver;
	}

	/**
	 * navigates to specific url.
	 * 
	 * @param url  is the url that you wants to navigates to.
	 * @param test is the test case from the extent report to log your test steps.
	 */
	@Override
	public void goToUrl(String url, ExtentTest test) {
		webdriver.get(url);
		test.log(Status.INFO, "Browser has been navigated to " + url);
	}

	/**
	 * navigates to specific url.
	 * 
	 * @param url is the url that you wants to navigates to.
	 */
	@Override
	public void goToUrl(String url) {
		webdriver.get(url);
	}

	/**
	 * closes the opened window.
	 * 
	 */
	@Override
	public void closeSingleWindow() {
		webdriver.close();
	}

	/**
	 * closes the opened window.
	 * 
	 * @param test is the test case from the extent report to log your test steps.
	 */
	@Override
	public void closeSingleWindow(ExtentTest test) {
		webdriver.close();
		test.log(Status.INFO, "The browser has been closed");
	}

	@Override
	public void closeAllWindows() {
		webdriver.quit();
	}

	/**
	 * closes all the opened window.
	 * 
	 * @param test is the test case from the extent report to log your test steps.
	 */
	@Override
	public void closeAllWindows(ExtentTest test) {
		webdriver.quit();
		test.log(Status.INFO, "All windows have been closed");
	}

	/**
	 * scrolls down to the end of the web page.
	 * 
	 */
	@Override
	public void scrollDown() {
		jsDriver.executeJsScript("window.scrollBy(0,500)", getWebdriver());
	}

	/**
	 * is used by the frame to switch to it.
	 * 
	 * @param byLocator the locator of the frame.
	 */
	@Override
	public void switchToFrame(By byLocator) {
		waitDriver.waitAndSwitchToFrame(byLocator, getWebdriver());
		webdriver.switchTo().frame(getWebdriver().findElement(byLocator));
	}

	/**
	 * is used by the frame to switch to it.
	 * 
	 * @param frameName is the name of the frame
	 */
	@Override
	public void switchToFrameName(String frameName) {
		waitDriver.waitAndSwitchToFrame(frameName, getWebdriver());
		webdriver.switchTo().frame(frameName);
	}

	/**
	 * is used by the frame to switch to it.
	 * 
	 * @param frameIndex is the index of the frame in the web page.
	 */
	@Override
	public void switchToFrameIndex(int frameIndex) {
		waitDriver.waitAndSwitchToFrame(frameIndex, getWebdriver());
		webdriver.switchTo().frame(frameIndex);
	}

	/**
	 * is used by the alert to switch to it.
	 */
	@Override
	public Alert switchToAlert() {
		waitDriver.waitForAlertToBePresent(getWebdriver());
		return webdriver.switchTo().alert();
	}
	/**
	 * scrolls up to the top of the web page.
	 * 
	 */
	@Override
	public void scrollUp() {
		jsDriver.executeJsScript("window.scrollBy(0,0)", getWebdriver());
	}

	/**
	 * switches to the default in case the driver switched already to frame.
	 */
	@Override
	public void switchToDefault() {
		webdriver.switchTo().defaultContent();
	}

	/**
	 * maximizes the window.
	 */
	@Override
	public void maximizeWindow() {
		webdriver.manage().window().maximize();
	}

	/**
	 * moves to specific point by using it's x and y coordinates.
	 */
	@Override
	public void moveToPoint(int x, int y) {
		actionDriver.moveByOffset(webdriver, x, y);
	}
}
