package com.automation.browser;

import com.aventstack.extentreports.ExtentTest;

public interface IDriveable {

	public void goToUrl(String url, ExtentTest test);

	public void goToUrl(String url);

	public void closeSingleWindow();

	public void closeSingleWindow(ExtentTest test);

	public void closeAllWindows();

	public void closeAllWindows(ExtentTest test);
	
	public void scrollDown();
	
	public void scrollUp();
}
