package com.automation.utilities;

import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.Element;
import com.automation.jsonParser.ElementParser;


public class Utilities {

	public static boolean isSheetExists(Workbook workbook,String sheetName) throws IOException {

		Sheet sheet = workbook.getSheet(sheetName);
		Iterator<Sheet> sheetIterator = workbook.iterator();
		boolean foundSheet = false;
		while (sheetIterator.hasNext()) {
			Sheet validSheet = sheetIterator.next();
			if (validSheet.equals(sheet)) {
				foundSheet = true;
				break;
			}
		}
		return foundSheet;
	}
}
