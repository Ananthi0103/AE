package com.AutomationExercise.demo.generic.Fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String  getDataFromExcel(String sheetname, int rownum, int cellnum) throws Throwable, IOException {
		
   	    FileInputStream fis=new FileInputStream("./src/main/resources/Testdata/AETestdata.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    String Exceldata = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return Exceldata;
	}
	
	public int getRowCount(String sheetname) throws Throwable {
		  FileInputStream fis=new FileInputStream("./src/main/resources/Testdata/AETestdata.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		  int rowcount = wb.getSheet(sheetname).getLastRowNum();
		  return rowcount;
	}
	public int getcellCount(String sheetname , int row) throws Throwable {
		  FileInputStream fis=new FileInputStream("./src/main/resources/Testdata/AETestdata.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		  int cellcount = wb.getSheet(sheetname).getRow(row).getLastCellNum();
		  return cellcount;
	}
	
	public void setDataintoExcel(String sheetname, int rownum, int cellnum, String data) throws Throwable, IOException {
		 FileInputStream fis=new FileInputStream("./src/main/resources/Testdata/AETestdata.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		  wb.getSheet(sheetname).getRow(rownum).createCell(cellnum);
		  FileOutputStream fos=new FileOutputStream("./src/main/resources/Testdata/AETestdata.xlsx");
		  wb.write(fos);
		  wb.close();
		  }

}
