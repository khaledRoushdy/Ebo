package com.automation.excel;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelTestParser implements ITestCaseParser {

	private ExcelParser excelParser;

	public ExcelTestParser(String filePath) throws IOException {
		this.excelParser = new ExcelParser(filePath);
	}

	@Override
	public Object getSingleTestData(String sheetName, String testCaseName, String testDataKey) throws IOException {
		int columnIndex = excelParser.getColumnIndex(sheetName, testDataKey);
		int rowIndex = excelParser.getRowIndex(sheetName, testCaseName);
		Object cellValue = excelParser.getCellValue(sheetName, rowIndex, columnIndex);
		return cellValue.toString();
	}

	@Override
	public Map<Object, Object> getTestCaseData(String sheetName, String testCaseName) throws IOException {
		Map<Object, Object> testCaseData = new HashMap<Object, Object>();
		int rowIndex = excelParser.getRowIndex(sheetName, testCaseName);
		List<Object> rowData = excelParser.getRow(sheetName, rowIndex);
		List<Object> keyData = excelParser.getRow(sheetName, 0);
		for (int i = 1; i < rowData.size(); i++) {
			testCaseData.put(keyData.get(i), rowData.get(i));
		}
		return testCaseData;
	}

	@Override
	public HashMap<String, HashMap<String, String>> getAllTestCasesData(String sheetName) throws IOException {
		HashMap<String, HashMap<String, String>> allTestData = excelParser.getSheetData(sheetName);
		return allTestData;
	}
}
