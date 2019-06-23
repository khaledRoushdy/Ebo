package com.github.khaledroushdy.excel;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public interface IExcelParser {

	//List<List<Object>> getSheetData(String sheetName) throws IOException;
	
	HashMap<String,HashMap<String,String>> getSheetData(String sheetName) throws IOException;

	List<Object> getRow(String sheetName, int rowIndex) throws IOException;

	List<Object> getColumn(String sheetName, int colIndex) throws IOException;

	Object getCellValue(String sheetName, int colIndex, int rowIndex) throws IOException;
	
	List<Object> getRowByName(String sheetName,String rowName) throws IOException;
	
	int getRowIndex(String sheetName,String rowName) throws IOException;
	
	int getColumnIndex(String sheetName,String columnName) throws IOException;

}
