package org.info;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sampl1 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\USER\\eclipse-workspace\\MvnProjs\\ExcelSheets\\newExcel.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet s=book.getSheet("new");
		Row row = s.getRow(0);
		Cell cell = row.getCell(0);
		
		String name = cell.getStringCellValue();
		if (name.startsWith("jav")) {
			cell.setCellValue("Selenium");
		}else {
		cell.setCellValue("python");
	}
		FileOutputStream fout=new FileOutputStream(f);
		book.write(fout);
		System.out.println("done");


	}

}
