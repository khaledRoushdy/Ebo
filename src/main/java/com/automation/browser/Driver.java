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

	public Driver(String driverName, String driverLocation) {
		this.webdriver = setDriver(driverName, driverLocation);
		jsDriver = new JavascriptDriver();
		waitDriver = new WaitDriver(40);
	}

	public WebDriver getWebdriver() {
		return webdriver;
	}

	public WebDriver setDriver(String name, String location) {

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

	@Override
	public void goToUrl(String url, ExtentTest test) {
		webdriver.get(url);
		test.log(Status.INFO, "Browser has been navigated to " + url);
	}

	@Override
	public void goToUrl(String url) {
		webdriver.get(url);
	}

	@Override
	public void closeSingleWindow() {
		webdriver.close();
	}

	@Override
	public void closeSingleWindow(ExtentTest test) {
		webdriver.close();
		test.log(Status.INFO, "The browser has been closed");
	}

	@Override
	public void closeAllWindows() {
		webdriver.quit();
	}

	@Override
	public void closeAllWindows(ExtentTest test) {
		webdriver.quit();
		test.log(Status.INFO, "All windows have been closed");
	}

	@Override
	public void scrollDown() {
		jsDriver.executeJsScript("window.scrollBy(0,500)", getWebdriver());
	}

	@Override
	public void switchToFrame(By byLocator) {
		waitDriver.waitAndSwitchToFrame(byLocator, getWebdriver());
		webdriver.switchTo().frame(getWebdriver().findElement(byLocator));
	}

	@Override
	public void switchToFrameName(String frameName) {
		waitDriver.waitAndSwitchToFrame(frameName, getWebdriver());
		webdriver.switchTo().frame(frameName);
	}

	@Override
	public void switchToFrameIndex(int frameIndex) {
		waitDriver.waitAndSwitchToFrame(frameIndex, getWebdriver());
		webdriver.switchTo().frame(frameIndex);
	}

	@Override
	public Alert switchToAlert() {
		waitDriver.waitForAlertToBePresent(getWebdriver());
		return webdriver.switchTo().alert();
	}

	@Override
	public void scrollUp() {

	}

	@Override
	public void switchToDefault() {
		webdriver.switchTo().defaultContent();
	}

	@Override
	public void maximizeWindow() {
		webdriver.manage().window().maximize();
	}
}
