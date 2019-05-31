package com.automation.tool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.browser.Driver;
import com.automation.elements.clickableelements.Button;
import com.automation.elements.clickableelements.Hyperlink;
import com.automation.elements.inputelements.Textbox;
import com.automation.excel.ExcelParser;
import com.automation.excel.ExcelTestParser;
import com.automation.report.ExtentManager;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {

		System.out.println("Hello World!");
//		ChromeDriver driver = new ChromeDriver();
//		Button e = new Button(By.id(""), driver);
//		e.clickOnButton();
//		Textbox text = new Textbox(By.className(""),driver);
//		text.enterText("");
//		Span span = new Span(By.cssSelector(""),driver);
//		String xxxx = span.getText();
//		span.getTextUsingJs();
		// ElementParser parser = new
		// ElementParser("C:\\Users\\asus\\Desktop\\MyTrialsPage.json");
		// By grid= parser.getElementByName("TrialsGrid");
		// ExcelUtilities excelUtilties = new ExcelUtilities();
		// HashMap<String, String> myDataInMap = new HashMap<String, String>();
		// HashMap<String, HashMap<String, String>> allData = new HashMap<String,
		// HashMap<String, String>>();

		ExtentReports extentReport = ExtentManager.getExtent("C:\\Users\\asus\\Downloads\\", "khaledReport.html");
		// ExtentReports report = new ExtentReports();
		// report.attachReporter(new
		// ExtentHtmlReporter("C:\\Users\\asus\\Downloads\\MyReport.html"));
		ExtentTest test = extentReport.createTest("my test", "my test description");
		test.log(Status.INFO, "driver has been reopened");
		test.log(Status.INFO, "driver has been reclosed");

		// extentReport.flush();

		//ExcelParser parser = new ExcelParser("C:\\Users\\asus\\Downloads\\data10.xlsx");
		//Sheet sheet = parser.getExcelSheet("LoginTests");

		ExcelTestParser testParser = new ExcelTestParser("C:\\Users\\asus\\Downloads\\data10.xlsx");
		Map<Object, Object> data = testParser.getSpecificTestCase("LoginTests", "Successful login");
		// testParser.getValue("LoginTests", "username", "Successful login");

		for (Map.Entry<Object, Object> entry : data.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}

		Map<String, HashMap<String, String>> allData = testParser.getAllTestCases("LoginTests");

		String userName = testParser.getCellValue("LoginTests", "Failed login", "password").toString();
		
		//int columnnumber = parser.getColumnIndex("LoginTests", "username");
		//int rownumber = parser.getRowIndex("LoginTests", "Successful login");

		Driver driver = new Driver("Chrome","");
//		driver.goToUrl("https://www.google.com/intl/ALL/gmail/about/");
//		
//		Button button = new Button(By.cssSelector("div.item__content>div:nth-child(3)>a:nth-child(1)"),driver);
//		button.clickOnItUsingJs();

		driver.goToUrl("https://www.google.com/", test);
		Hyperlink link = new Hyperlink(By.cssSelector("div#SIvCob>a:nth-child(1)"), driver);
		link.clickOnIt();

		Textbox textbox = new Textbox(By.name("q"), driver);
		// textbox.enterTextUsingJs("testing");
		textbox.enterText("testing", "google search", test);
		driver.closeAllWindows(test);
		extentReport.flush();

		// driver.closeAllWindows();

//		List<List<Object>> data= parser.getSheetData("LoginTests");
//		String cellValue = parser.getCellValue("LoginTests", 100, 100).toString();
//		List<Object> rowData= parser.getRow("LoginTests", 0);
//		List<Object> columnData = parser.getColumn("LoginTests", 0);
//		List<String> myDataInList = new ArrayList<String>();
		// ArrayList<String> data = new ArrayList<String>();
//		try {
//
//			//allData = excelUtilties.getAllTestCasesData("C:\\Users\\asus\\Downloads\\Data3.xlsx", "LoginTests");
//
//		} catch (IOException ex) {
//			// TODO Auto-generated catch block
//			ex.printStackTrace();
//		}

//		for (String k : allData.keySet()) {
//			Map<String, String> m1 = allData.get(k);
//
//			for (String k1 : m1.keySet()) {
//				String l = m1.get(k1);
//			}
//
//			for (Map.Entry<String, String> item : myDataInMap.entrySet()) {
//				// ...
//				String x = item.getKey();
//				String v = item.getValue();
//
//				System.out.println(x);
//				System.out.println(v);
//			}
//
//		}
	}
}
