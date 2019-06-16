package com.automation.browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.automation.elements.Element;
import com.automation.elements.Frame;
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
	
	public Alert switchToAlert();
	
	public void switchToDefault();
		
	public void switchToFrameName(String frameName);
	
	public void switchToFrameIndex(int frameIndex);
	
	public void switchToFrame(By byLocator);

	public void maximizeWindow();
	
	public void moveToPoint(int x,int y);
}
