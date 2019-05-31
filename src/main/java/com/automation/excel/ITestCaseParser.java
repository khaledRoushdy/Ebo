package com.automation.excel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public interface ITestCaseParser {

	Object getCellValue(String sheetName, String testCaseName, String testDataKey) throws IOException;
	
	Map<Object, Object> getSpecificTestCase(String sheetName, String testCaseName) throws IOException;
	
	HashMap<String, HashMap<String, String>> getAllTestCases(String sheetName) throws IOException;
	
}
