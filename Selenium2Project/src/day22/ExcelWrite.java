package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("c:\\users\\sai\\desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=ws.getRow(0);
		Cell c=r.getCell(2);
		c.setCellValue("soapui");
		
		
		r=ws.getRow(1);
		c=r.createCell(1);
		c.setCellValue("ABC");
		
		
		r=ws.createRow(2);
		c=r.createCell(0);
		c.setCellValue("XYZ");
		
		FileOutputStream f=new FileOutputStream("c:\\users\\sai\\desktop\\Book1.xlsx");
		wb.write(f);
		

	}

}
