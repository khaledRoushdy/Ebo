package com.github.khaledroushdy.excel;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelTestParser implements ITestCaseParser {

	private ExcelParser excelParser;

	/**
	 * Excel Parser constructor.
	 * 
	 * @param filePath is the path of the excel file.
	 * @throws java.io.IOException is thrown when the file path is invalid or the file is not excel.
	 */
	public ExcelTestParser(String filePath) throws IOException {
		this.excelParser = new ExcelParser(filePath);
	}

	/**
	 * gets cell value in a specific excel sheet.
	 * 
	 * @param sheetName    the name of the sheet.
	 * @param testCaseName the name of the test case.
	 * @param columnName   the name of the column.
	 * @return a <code> Object </code> returning test data.
	 * @throws IOException if the file path is wrong or the file is not excel.
	 */
	@Override
	public Object getCellValue(String sheetName, String testCaseName, String columnName) throws IOException {
		int columnIndex = excelParser.getColumnIndex(sheetName, columnName);
		int rowIndex = excelParser.getRowIndex(sheetName, testCaseName);
		Object cellValue = excelParser.getCellValue(sheetName, rowIndex, columnIndex);
		return cellValue.toString();
	}

	/**
	 * gets all the test cases from a specific sheet.
	 * 
	 * @param sheetName the name of the sheet.
	 * @return map of maps where the key of the first map is the sheet name. and key of the inner maps is the name of the test cases.
	 */
	@Override
	public HashMap<String, HashMap<String, String>> getAllTestCases(String sheetName) throws IOException {
		HashMap<String, HashMap<String, String>> allTestData = excelParser.getSheetData(sheetName);
		return allTestData;
	}

	/**
	 * gets a specific test case from a specific excel sheet.
	 * 
	 * @param sheetName the name of the sheet.
	 * @param testCaseName the name of the test case in the first row of the sheet.
	 * @return map containing the test data and it's corresponding value.
	 */
	@Override	
	public Map<Object, Object> getSpecificTestCase(String sheetName, String testCaseName) throws IOException {
		Map<Object, Object> testCaseData = new HashMap<Object, Object>();
		int rowIndex = excelParser.getRowIndex(sheetName, testCaseName);
		List<Object> rowData = excelParser.getRow(sheetName, rowIndex);
		List<Object> keyData = excelParser.getRow(sheetName, 0);
		for (int i = 1; i < rowData.size(); i++) {
			testCaseData.put(keyData.get(i), rowData.get(i));
		}
		return testCaseData;
	}
}
