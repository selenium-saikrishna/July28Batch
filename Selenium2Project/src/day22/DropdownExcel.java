package day22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownExcel {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("c:\\users\\sai\\desktop\\Dropdown.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		
		for(int i=0;i<dropdown.size();i++)
		{
			r=ws.createRow(i);
			r.createCell(0).setCellValue(dropdown.get(i).getText());
			
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
			{
				r.createCell(1).setCellValue("Passed");
				
			}
			else
			{
				r.createCell(1).setCellValue("Failed");
				
			}
		}
		driver.close();
		FileOutputStream f=new FileOutputStream("c:\\users\\sai\\desktop\\Dropdown.xlsx");
		wb.write(f);
	}

}
