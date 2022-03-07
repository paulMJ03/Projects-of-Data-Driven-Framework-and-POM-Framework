package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		File f=new File("E:\\Selenium\\Book1-EMP DETAILS.xlsx");
		FileInputStream f1=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(f1);
		Sheet s=book.getSheet("Sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row row = s.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String name = cell.getStringCellValue();
					System.out.println(name);
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					System.out.println(dateCellValue);
					SimpleDateFormat sim=new SimpleDateFormat("DD/MM/YYYY");
					String format = sim.format(dateCellValue);
					System.out.println(format);
				}else {
					double d = cell.getNumericCellValue();
					System.out.println(d);
					long l=(long)d;//typecasting
					String name = String.valueOf(l);
					System.out.println(name);
					
					
				}
				
			}
			
		}
		
		

	}

}
