package com.automation.tool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.elements.Button;
import com.automation.elements.Element;
import com.automation.elements.Span;
import com.automation.elements.Textbox;
import com.automation.excel.ExcelUtilities;
import com.automation.jsonParser.ElementParser;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ChromeDriver driver = new ChromeDriver();
		WebElement element = driver.findElement(By.id(""));
		Button e = new Button(By.id(""), driver);
		e.clickOnButton();

		Textbox text = new Textbox(By.className(""),driver);
		text.enterText("");
		Span span = new Span(By.cssSelector(""),driver);
		String xxxx = span.getText();

		
		
		
		// ElementParser parser = new
		// ElementParser("C:\\Users\\asus\\Desktop\\MyTrialsPage.json");
		// By grid= parser.getElementByName("TrialsGrid");
		ExcelUtilities excelUtilties = new ExcelUtilities();
		HashMap<String, String> myDataInMap = new HashMap<String, String>();
		HashMap<String, HashMap<String, String>> allData = new HashMap<String, HashMap<String, String>>();

		List<String> myDataInList = new ArrayList<String>();
		// ArrayList<String> data = new ArrayList<String>();
		try {

			allData = excelUtilties.getAllTestCasesData("C:\\Users\\asus\\Downloads\\Data3.xlsx", "LoginTests");

		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

		for (String k : allData.keySet()) {
			Map<String, String> m1 = allData.get(k);

			for (String k1 : m1.keySet()) {
				String l = m1.get(k1);
			}

			for (Map.Entry<String, String> item : myDataInMap.entrySet()) {
				// ...
				String x = item.getKey();
				String v = item.getValue();

				System.out.println(x);
				System.out.println(v);
			}

		}
	}
}
