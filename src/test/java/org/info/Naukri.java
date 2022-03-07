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

public class Naukri extends HelperClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		String[] Array= {"paul","paul@gmail.com","paul@123","9952831675"};
		 int count=0;
		 String Location="C:\\Users\\USER\\eclipse-workspace\\MvnProjs\\ExcelSheets\\newExcel.xlsx";
		    File f=new File(Location);
			FileInputStream fin=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fin);
			String sheetNumbr="sheet3";
			Sheet sheet=wb.getSheet(sheetNumbr);
			for(int i=0;i<4;i++)
			{
			Row row=sheet.createRow(i);
			
			for(int j=0;j<1;j++)
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
		
			launchBrowser();
			loadUrl("https://www.naukri.com/registration/createAccount");
			getTitle();Thread.sleep(2500);
			WebElement name = driver.findElement(By.id("name"));
			toText(name, excelRead(Location,0, 0, sheetNumbr));
			WebElement mail = driver.findElement(By.id("email"));
			toText(mail, excelRead(Location,1, 0, sheetNumbr));
			WebElement pass = driver.findElement(By.id("password"));
			toText(pass, excelRead(Location,2, 0, sheetNumbr));
			WebElement mob = driver.findElement(By.id("mobile"));
			toText(mob, excelRead(Location,3, 0, sheetNumbr));
			WebElement reg = driver.findElement(By.xpath("//*[@type='submit']"));
			btnClick(reg);
	}

}
