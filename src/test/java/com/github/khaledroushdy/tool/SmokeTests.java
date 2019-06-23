package com.github.khaledroushdy.tool;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.browser.DriverTypes;
import com.github.khaledroushdy.excel.ExcelTestParser;
import com.github.khaledroushdy.pages.FramePage;
import com.github.khaledroushdy.pages.HomePage;
import com.github.khaledroushdy.pages.SelectPage;
import com.github.khaledroushdy.pages.SigninPage;
import com.github.khaledroushdy.report.ExtentManager;

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
		excelTestParser = new ExcelTestParser("C:\\Users\\asus\\Downloads\\datatest2.xlsx");
		driver = new Driver(DriverTypes.Chrome,"src/main/resources/seleniumdrivers/chromedriver.exe");
		//excelTestParser.getSingleTestData("", "", "");
	}

	@Test
	public void test1() {
		driver.goToUrl("https://www.ultimateqa.com/automation/");
		com.github.khaledroushdy.pages.UltimateQcPage ultimateqcPage = new com.github.khaledroushdy.pages.UltimateQcPage(driver);
		List<String> allLinks = ultimateqcPage.getLinks();
		for(String link: allLinks) {
			System.out.println(link);
		}
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
		Map<Object,Object> credentials= excelTestParser.getSpecificTestCase("AddOwnersAndPetsTests", "login");
		String y= credentials.get("firstname").toString();
		String city = excelTestParser.getCellValue("AddOwnersAndPetsTests", "login", "city").toString();
		Map<String,HashMap<String,String>> m= excelTestParser.getAllTestCases("AddOwnersAndPetsTests");
		
		for(String k : m.keySet()) {
		    Map<String,String> m1 = m.get(k);

		    for(String k1 : m1.keySet()) {
		        String l = m1.get(k1);
		        System.out.println(l);
		    }
		}
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
