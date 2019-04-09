package com.automation.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.automation.utilities.Utilities;

public class ExcelParser implements IExcelParser {

	private String filePath;
	private Workbook workbook;

	public ExcelParser(String filePath) throws IOException {
		this.setFilePath(filePath);
		if (filePath.endsWith("xlsx")) {
			workbook = new XSSFWorkbook(filePath);
		}

		else if (filePath.endsWith(".xls")) {
			FileInputStream inputStream = new FileInputStream(filePath);
			workbook = new HSSFWorkbook(inputStream);
		} else
			throw new IllegalStateException("doesn't support this format.");
	}

	public Workbook getWorkbook() {
		return workbook;
	}

	public Sheet getExcelSheet(String sheetName) throws IOException {
		Sheet sheet = getWorkbook().getSheet(sheetName);
		if (Utilities.isSheetExists(workbook, sheetName))
			return sheet;
		return null;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public  HashMap<String,HashMap<String,String>> getSheetData(String sheetName) throws IOException {
		Sheet sheet = getExcelSheet(sheetName);
		HashMap<String, HashMap<String, String>> allTestData = new HashMap<String, HashMap<String, String>>();
		if (sheet != null) {
			int lastRowNumber = sheet.getLastRowNum();
			Row columnData = sheet.getRow(0);
			for (int j = 1; j <= lastRowNumber; j++) {
				Row testCasesRow = sheet.getRow(j);
				HashMap<String, String> myMap = new HashMap<String, String>();
				for (int i = 1; i < columnData.getLastCellNum(); i++) {
					System.out.println("no of cells in row" + columnData.getLastCellNum());
					String key = columnData.getCell(i).getStringCellValue();
					DataFormatter formatter = new DataFormatter();
					String value = formatter.formatCellValue(testCasesRow.getCell(i));
					myMap.put(key, value);
				}
				allTestData.put(testCasesRow.getCell(0).getStringCellValue(), myMap);
			}
			return allTestData;
		}
		return null;
	}
	
	@Override
	public List<Object> getRow(String sheetName, int rowIndex) throws IOException {
		List<Object> rowData = new ArrayList<Object>();
		Sheet sheet = getExcelSheet(sheetName);
		if (sheet != null) {
			Row row = sheet.getRow(rowIndex);
			for (Cell cell : row) {
				DataFormatter formatter = new DataFormatter();
				rowData.add(formatter.formatCellValue(cell));
			}
		}
		return rowData;
	}

	@Override
	public int getRowIndex(String sheetName, String rowName) throws IOException {
		Sheet sheet = getExcelSheet(sheetName);
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			DataFormatter formatter = new DataFormatter();
			String cellValue = formatter.formatCellValue(sheet.getRow(i).getCell(0));
			if (cellValue.equals(rowName)) {
				return i;
			}
		}
		return 0;
	}

	@Override
	public List<Object> getRowByName(String sheetName, String rowName) throws IOException {
		List<Object> rowData = new ArrayList<Object>();
		Sheet sheet = getExcelSheet(sheetName);
		for (Row myRow : sheet) {
			DataFormatter formatter = new DataFormatter();
			String cellValue = formatter.formatCellValue(myRow.getCell(0));
			if (cellValue.equals(rowName)) {
				for (Cell cell : myRow) {
					rowData.add(formatter.formatCellValue(cell));
				}
			}
		}
		return rowData;
	}

	@Override
	public List<Object> getColumn(String sheetName, int colIndex) throws IOException {
		List<Object> columnData = new ArrayList<Object>();
		Sheet sheet = getExcelSheet(sheetName);
		if (sheet != null) {
			for (Row r : sheet) {
				Cell cell = r.getCell(colIndex);
				DataFormatter formatter = new DataFormatter();
				columnData.add(formatter.formatCellValue(cell));
			}
		}
		return columnData;
	}

	@Override
	public int getColumnIndex(String sheetName, String columnName) throws IOException {
		Sheet sheet = getExcelSheet(sheetName);
		if (sheet != null) {
			Row row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				DataFormatter formatter = new DataFormatter();
				String cellValue = formatter.formatCellValue(row.getCell(i));
				if (cellValue.equals(columnName)) {
					return i;
				}
			}
		}
		return 0;
	}

	@Override
	public Object getCellValue(String sheetName, int rowIndex, int colIndex) throws IOException {
		String value = null;
		Sheet sheet = getExcelSheet(sheetName);
		if (sheet != null) {
			Row row = sheet.getRow(rowIndex);
			Cell cell = row.getCell(colIndex);
			DataFormatter formatter = new DataFormatter();
			value = formatter.formatCellValue(cell);

		}
		return value;
	}
}
