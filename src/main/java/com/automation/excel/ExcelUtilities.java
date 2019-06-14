package com.automation.excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	public static boolean isSheetExists(Workbook workbook, String sheetName) throws IOException {

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
