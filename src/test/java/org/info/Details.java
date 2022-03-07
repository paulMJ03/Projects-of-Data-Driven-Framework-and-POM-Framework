package org.info;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Details {
	
	public Object[][] excel() throws IOException
	{
		File f=new File("C:\\Users\\USER\\Desktop\\Learn1.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sheet=wb.getSheet("Sheet2");
		Object[][] array=new Object[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getPhysicalNumberOfCells()];

		for(int j=0;j<array.length;j++)
		{
		Row row=sheet.getRow(j);
		
		for(int i=0;i<row.getPhysicalNumberOfCells();i++)
		{
		Cell cell=row.getCell(i);
		switch(cell.getCellType())
		{
		case Cell.CELL_TYPE_STRING:
			//System.out.println(cell.getStringCellValue());
			array[j][i]=cell.getStringCellValue();
			break;
		case Cell.CELL_TYPE_NUMERIC:
			//System.out.println(cell.getNumericCellValue());
			array[j][i]=cell.getNumericCellValue();
			break;
		case Cell.CELL_TYPE_FORMULA:
			System.out.println("");
		    break;
		case Cell.CELL_TYPE_BOOLEAN:
			System.out.println(cell.getBooleanCellValue());
			break;
		default:
			System.out.println("hai");
		    break;
		
		}
		}
		}
		
		return array;
		
	}
	

	public static void main(String[] args) throws IOException {
		
		Details obj=new Details();	
		Object Array[][]=obj.excel();

for(int i=0;i<Array.length;i++)
	
{
	for(int j=0;j<Array[i].length;j++)
{
	System.out.print(Array[i][j]);
	System.out.print("  ");
}
	System.out.println("");
}
	}

}
