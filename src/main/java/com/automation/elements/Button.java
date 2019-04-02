package com.automation.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button extends Element implements IClickable{



	public Button(By byLocator, WebDriver driver) {
		super(byLocator, driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clickOnButton() {
		getElement().click();
	}
	
	@Override
	public void clickOnButtonUsingJs() {
	
	}
	
}
