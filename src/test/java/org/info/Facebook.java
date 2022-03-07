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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.helper.HelperClass;

public class Facebook extends HelperClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		String[] Array= {"paul@gmail.com","paul@123"};
		int count=0;
		String location="C:\\Users\\USER\\eclipse-workspace\\MvnProjs\\ExcelSheets\\newExcel.xlsx";
		File f=new File(location);
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		String sheetNumbr="Sheet4";
		Sheet sheet = wb.getSheet(sheetNumbr);
		for (int i = 0; i < 2; i++) {
			Row row = sheet.createRow(i);
			for (int j = 0; j < 1; j++) {
				Cell cell = row.createCell(j);
				cell.setCellValue(Array[count]);
				count++;
			}
			System.out.println("cell count:"+row.getPhysicalNumberOfCells());
			
		}
		System.out.println("row count:"+sheet.getPhysicalNumberOfRows());
		
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		getTitle();Thread.sleep(2500);
		WebElement email = driver.findElement(By.id("email"));
		toText(email, excelRead(location, 0, 0, sheetNumbr));
		WebElement pass = driver.findElement(By.id("pass"));
		toText(pass, excelRead(location, 0, 1, sheetNumbr));
		

}}
