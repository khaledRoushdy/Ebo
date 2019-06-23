package com.github.khaledroushdy.excel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public interface ITestCaseParser {

	Object getCellValue(String sheetName, String testCaseName, String testDataKey) throws IOException;

	/**
	 * gets a specific test case.
	 * 
	 * @param sheetName the name of the sheet.
	 * @param testCaseName the name of the test case in the row.
	 */
	Map<Object, Object> getSpecificTestCase(String sheetName, String testCaseName) throws IOException;
	
	HashMap<String, HashMap<String, String>> getAllTestCases(String sheetName) throws IOException;
	
}
