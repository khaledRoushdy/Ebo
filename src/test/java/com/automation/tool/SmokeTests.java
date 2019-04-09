package com.automation.tool;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runners.JUnit4;

import com.automation.browser.Driver;
import com.automation.pages.HomePage;
import com.automation.report.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class SmokeTests {

	private HomePage homePage;
	private Driver driver;
	private ExtentReports extentReport;
	private ExtentTest test;

	@Rule
	public TestName name = new TestName();

	@Before
	public void setUp() {
		extentReport = ExtentManager.getExtent("C:\\Users\\asus\\Downloads", "regression report.html");
		driver = new Driver();
		driver.getDriver("chrome");
	}

	@Test
	public void shouldNavigateToAutomationLink() {
		test = extentReport.createTest(name.getMethodName(), "Should navigate to automation link");
		homePage = new HomePage(driver,test);
		driver.goToUrl("https://www.ultimateqa.com/automation/",test);
		homePage.goToAutomationLink();
	}
	
	@Test
	public void shouldNavigateToLandingPage() {
		test = extentReport.createTest(name.getMethodName(), "Should navigate to landing page");
		homePage = new HomePage(driver, test);
		driver.goToUrl("https://www.ultimateqa.com/automation/",test);
		homePage.goToLandingPage();
	}

	@After
	public void tearDown() {
		driver.closeSingleWindow(test);
		extentReport.flush();
	}
}
