package com.github.khaledroushdy.clickableelements;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.elements.Element;
import com.github.khaledroushdy.elements.IAlertable;

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
