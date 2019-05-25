package com.automation.tool;

import java.io.IOException;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.automation.browser.Driver;
import com.automation.excel.ExcelTestParser;
import com.automation.pages.FramePage;
import com.automation.pages.HomePage;
import com.automation.pages.SelectPage;
import com.automation.pages.SigninPage;
import com.automation.report.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class SmokeTests {

	private HomePage homePage;
	private SigninPage signInPage;
	private Driver driver;
	private ExtentReports extentReport;
	private ExtentTest test;
	private ExcelTestParser excelTestParser;
	private SelectPage selectPage;
	private FramePage framePage;
	
	@Rule
	public TestName name = new TestName();

	@Before
	public void setUp() throws IOException {
		extentReport = ExtentManager.getExtent("C:\\Users\\asus\\Downloads", "regression report.html");
		excelTestParser = new ExcelTestParser("C:\\Users\\asus\\Downloads\\data10.xlsx");
		driver = new Driver("Chrome");
	}

	@Test
	public void shouldNavigateToAutomationLink() {
		test = extentReport.createTest(name.getMethodName(), "Should navigate to automation link");
		homePage = new HomePage(driver,test);
		driver.goToUrl("https://www.ultimateqa.com/automation/",test);
		driver.maximizeWindow();
		homePage.goToAutomationLink();
	}
	
	@Test
	public void shouldNavigateToLandingPage() {
		test = extentReport.createTest(name.getMethodName(), "Should navigate to landing page");
		homePage = new HomePage(driver, test);
		driver.goToUrl("https://www.ultimateqa.com/automation/",test);
		homePage.goToLandingPage();
	}

	@Test
	public void shouldSignIn() throws IOException {
		test = extentReport.createTest(name.getMethodName(), "Should be able to sign in");
		Map<Object,Object> credentials= excelTestParser.getTestCaseData("LoginTests", "Failed login");
		homePage = new HomePage(driver, test);
		signInPage = new SigninPage(driver, test);
		driver.goToUrl("https://www.ultimateqa.com/automation/",test);
		homePage.goToAutomationLink();
		driver.goToUrl("https://www.ultimateqa.com/complicated-page/");
		System.out.println(signInPage.getMypasswords().size());
		for (String x: signInPage.getMypasswords()) {
			System.out.println(x);
		}
		//signInPage.signIntoCourses("", "");
		//signInPage.signIntoCourses(credentials.get("username").toString(), credentials.get("password").toString());
		
	}
	
	@Test
	public void shouldSelectFromDropDown() {
		test = extentReport.createTest(name.getMethodName(), "should Select From DropDown");
		driver.goToUrl("https://www.toolsqa.com/automation-practice-form/",test);
		selectPage = new SelectPage(driver, test);
		selectPage.selectContient("Africa");
	}
	
	@Test
	public void shouldGoToFrame() {
		test = extentReport.createTest(name.getMethodName(), "should go to frame");
		driver.goToUrl("https://www.toolsqa.com/iframe-practice-page/");
		framePage = new FramePage(driver, test);
		framePage.goToFrame();
		
	}
	@After
	public void tearDown() {
		driver.closeSingleWindow(test);
		extentReport.flush();
	}
}
