package com.ExcelOperations;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



 

public class ExcelSingleDataSheet {

	public static void main(String[] args) throws Exception {
		// Identify the External File(Excel) in the System
		FileInputStream testDataFile = new FileInputStream("./src/com/ExcelOperations/OrangeHRM_LogInTestDataFile.xlsx");

		// Identify the WorkBook in the File
		@SuppressWarnings("resource")
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);

		// Identify the Sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("LogInTestData");

		// Identify a particular Row in the Sheet
		Row testDataSheetRow=testDataSheet.getRow(1);

		// Identify a Particular Row of Cell in the Row
		Cell RowofCell=testDataSheetRow.getCell(0);
		Cell NewCell=testDataSheetRow.getCell(1);
		
		// get the data from the Row of a Cell
		String testData=RowofCell.getStringCellValue();
		String testData1=NewCell.getStringCellValue();
		System.out.println(testData+" "+testData1);

		
	}

}
