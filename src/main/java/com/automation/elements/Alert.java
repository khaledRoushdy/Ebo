package com.automation.elements;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Alert implements IAlertable {

	protected By byLocator;
	protected Driver driver;

	public Alert(By byLocator,Driver driver) {
		this.byLocator = byLocator;
		this.driver = driver;
	}

	@Override
	public void acceptAlert() {
		driver.switchToAlert().accept();
	}

	@Override
	public void dismissAlert() {
		driver.switchToAlert().dismiss();
	}

	@Override
	public void acceptAlert(ExtentTest test, String alertName) {
		driver.switchToAlert().accept();
		test.log(Status.INFO, "Alert with name "+alertName+" has been accepted");
		
	}

	@Override
	public void dismissAlert(ExtentTest test, String alertName) {
		driver.switchToAlert().dismiss();
		test.log(Status.INFO, "Alert with name "+alertName+" has been dismissed");
	}
}
