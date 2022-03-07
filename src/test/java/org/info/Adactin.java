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
import org.data.ExcelWrite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

import com.helper.HelperClass;

public class Adactin extends HelperClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		String[] Array= {"Paul03696","53D137"};
		int count=0;
		
		String location="C:\\Users\\USER\\eclipse-workspace\\MvnProjs\\ExcelSheets\\newExcel.xlsx";
		File f=new File(location);
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		String sheetNumbr="Sheet1";
		Sheet sheet = wb.getSheet(sheetNumbr);
		
		for (int i = 0; i <2; i++) {
			Row row=sheet.createRow(i);
			
		for (int j = 0; j < 1; j++) {
			Cell cell=row.createCell(j);
			cell.setCellValue(Array[count]);
			count++;
		}
		}
		
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		
		
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/index.php");
		getTitle();Thread.sleep(2500);
		LoginPojo l=new LoginPojo();
		toText(l.getTxtEmail(),excelRead(location, 0, 0,sheetNumbr));
		toText(l.getTxtPass(), excelRead(location, 1, 0, sheetNumbr));
		btnClick(l.getBtnLogin());
		
		

	}

}
