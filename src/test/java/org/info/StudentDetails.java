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

public class StudentDetails {

	public static void main(String[] args) throws IOException {
		File f=new File(".\\ExcelSheets\\StudentDetails.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sheet=wb.getSheet("Sheet1");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("ROW COUNT: "+rowCount);
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("COL COUNT: "+lastCellNum);
		
		for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(i);
			
			
			for (int j = 0; j < lastCellNum; j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				String string = row.getCell(j).toString();
				System.out.println(" "+string);
			}
			
		}
		sheet.getRow(0).createCell(0).setCellValue("00");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		fos.close();
	
		
		
		
		
		

	}

}
