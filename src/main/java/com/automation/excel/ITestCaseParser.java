package com.automation.excel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public interface ITestCaseParser {

	Object getSingleTestData(String sheetName, String testCaseName, String testDataKey) throws IOException;
	
	Map<Object, Object> getTestCaseData(String sheetName, String testCaseName) throws IOException;
	
	HashMap<String, HashMap<String, String>> getAllTestCasesData(String sheetName) throws IOException;
	
}
