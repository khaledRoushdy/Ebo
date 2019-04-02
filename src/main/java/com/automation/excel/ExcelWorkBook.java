package com.automation.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWorkBook {

	private String filePath;
	private Workbook workbook;
	
	public ExcelWorkBook(String filePath) throws IOException {
		this.filePath = filePath;
		setWorkbook(filePath);
	}

	public Workbook getWorkbook() {
		return workbook;
	}

	public void setWorkbook(String filePath) throws IOException {
		
		if(filePath.endsWith("xlsx")) {
			workbook = new XSSFWorkbook(filePath);
		}
		
		else if(filePath.endsWith(".xls")) {
		    FileInputStream inputStream = new FileInputStream(filePath);
			workbook =  new HSSFWorkbook(inputStream);
		}
	}
}
