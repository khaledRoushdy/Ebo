package com.automation.elements.clickableelements;

import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.Element;
import com.automation.elements.IAlertable;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Alert extends Element implements IAlertable{

	public Alert(By byLocator, Driver driver) {
		super(byLocator, driver);
		// TODO Auto-generated constructor stub
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
