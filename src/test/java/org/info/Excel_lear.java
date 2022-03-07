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

public class Excel_lear {

	public static void main(String[] args) throws IOException {
	    String[] Array= {"user","Pass","user","Pass","user","Pass","user","Pass","user","Pass","user","Pass","user","Pass","user","Pass","user","Pass"};
		
	    int count=0;
	    File f=new File(".\\ExcelSheets\\newExcel.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sheet=wb.getSheet("Sheet2");
		for(int i=0;i<9;i++)
		{
		Row row=sheet.createRow(i);
		
		for(int j=0;j<2;j++)
		{
		Cell cell=row.createCell(j);
		cell.setCellValue(Array[count]);
		count++;
		}
		System.out.println("cell"+i+"="+row.getPhysicalNumberOfCells());
		}
		System.out.println("totall rows="+sheet.getPhysicalNumberOfRows());
		
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		fo.close();

	}

}
