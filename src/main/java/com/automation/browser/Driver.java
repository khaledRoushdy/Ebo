package com.automation.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.automation.utilities.DriverUtilities;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Driver implements IDriveable{

	private WebDriver webdriver;
	private JavascriptDriver jsDriver;
	
	public WebDriver getWebdriver() {
		return webdriver;
	}

	public void setWebdriver(WebDriver webdriver) {
		this.webdriver = webdriver;
	}

	public WebDriver getDriver(String name) {

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
			System.setProperty("webdriver.ie.driver", "src/main/resources/seleniumdrivers/IEDriverServer.exe");
			setWebdriver(new InternetExplorerDriver());
			break;

		case DriverTypes.Chrome:
			System.setProperty("webdriver.chrome.driver", "src/main/resources/seleniumdrivers/chromedriver.exe");
			setWebdriver(new ChromeDriver());
			break;
		}
		return getWebdriver();
	}

	@Override
	public void goToUrl(String url, ExtentTest test) {
		getWebdriver().get(url);
		test.log(Status.INFO, "Browser has been navigated to " + url);
	}

	@Override
	public void goToUrl(String url) {
		getWebdriver().get(url);
	}

	@Override
	public void closeSingleWindow() {
		getWebdriver().close();
	}

	@Override
	public void closeSingleWindow(ExtentTest test) {
		getWebdriver().close();
		test.log(Status.INFO, "The browser has been closed");
	}

	@Override
	public void closeAllWindows() {
		getWebdriver().quit();
	}

	@Override
	public void closeAllWindows(ExtentTest test) {
		getWebdriver().quit();
		test.log(Status.INFO, "All windows have been closed");
	}

	@Override
	public void scrollDown() {
		jsDriver = new JavascriptDriver();
		jsDriver.executeJsScript("window.scrollBy(0,500)", getWebdriver());
	}

	@Override
	public void scrollUp() {
		
	}
}
