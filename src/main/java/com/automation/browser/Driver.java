package com.automation.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {

	private WebDriver webdriver;

	public WebDriver getDriver(String name) {

		switch (name) {

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
			webdriver = new InternetExplorerDriver();
			break;

		case DriverTypes.Chrome:
			System.setProperty("webdriver.chrome.driver", "src/main/resources/seleniumdrivers/chromedriver.exe");
			webdriver = new ChromeDriver();
			break;
		}
		return webdriver;

	}
}
