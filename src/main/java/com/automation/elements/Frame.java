package com.automation.elements;

import org.openqa.selenium.By;
import com.automation.browser.Driver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Frame extends Element implements IFrameable {

	public Frame(By byLocator, Driver driver) {
		super(byLocator, driver);
	}

	@Override
	public void switchToFrame() {
		driver.switchToFrame(byLocator);
	}

	@Override
	public void switchToFrame(ExtentTest test, String frameName) {
		driver.switchToFrame(byLocator);
		test.log(Status.INFO, "browser has been switched successfully to frame " + "\"" + frameName + "\"");
	}

	@Override
	public void switchToFrameName(String frameName) {
		driver.switchToFrameName(frameName);
	}

	@Override
	public void switchToFrameName(ExtentTest test, String frameName) {
		driver.switchToFrameName(frameName);
		test.log(Status.INFO, "browser has been switched successfully to frame " + "\"" + frameName + "\"");
	}

	@Override
	public void switchToFrameIndex(int frameIndex) {
		driver.switchToFrameIndex(frameIndex);
	}

	@Override
	public void switchToFrameIndex(ExtentTest test, int frameIndex) {
		driver.switchToFrameIndex(frameIndex);
		test.log(Status.INFO, "browser has been switched successfully to frame with index " + "\"" + frameIndex + "\"");
	}
}
