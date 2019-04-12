package com.automation.elements;

import com.aventstack.extentreports.ExtentTest;

public interface IFrameable {

	public void switchToFrame();
	
	public void switchToFrame(ExtentTest test,String frameName);
}
