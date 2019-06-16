package com.automation.elements;

import com.aventstack.extentreports.ExtentTest;

public interface IFrameable {

	/**
	 * is used by the frame to switch to it.
	 * 
	 */
	public void switchToFrame();

	/**
	 * * is used by the frame to switch to it.
	 * 
	 * @param test      is the test case from the extent report to log your test
	 *                  steps.
	 * @param frameName is the name of the frame
	 */
	public void switchToFrame(ExtentTest test, String frameName);

	/**
	 * is used by the frame to switch to it.
	 * 
	 * @param frameName is the name of the frame
	 */
	public void switchToFrameName(String frameName);

	/**
	 * is used by the frame to switch to it.
	 * 
	 * @param test      is the test case from the extent report to log your test
	 *                  steps.
	 * @param frameName is the name of the frame
	 */
	public void switchToFrameName(ExtentTest test, String frameName);

	/**
	 * is used by the frame to switch to it.
	 * 
	 * @param frameIndex is the index of the frame in the web page.
	 */
	public void switchToFrameIndex(int frameIndex);

	/**
	 * is used by the frame to switch to it.
	 * 
	 * @param test       is the test case from the extent report to log your test
	 *                   steps.
	 * @param frameIndex is the index of the frame in the web page.
	 */
	public void switchToFrameIndex(ExtentTest test, int frameIndex);
}
