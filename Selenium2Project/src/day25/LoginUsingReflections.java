package day25;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginUsingReflections {
	LoginKeywords keys=new LoginKeywords();
	Method[] methods=keys.getClass().getMethods();
	@Test
	public void loginTest() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException
	{
		
		FileInputStream file=new FileInputStream(".//src//com//projectname//keywords//LoginKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rowCount=ws.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			Row r=ws.getRow(i);
			if(r.getCell(4).getStringCellValue().equals("Y"))
			{
				String action=r.getCell(3).getStringCellValue();
				invokeActions(action);
			}
		}
	}
	public void invokeActions(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<methods.length;i++)
		{
			if(methods[i].getName().equals(action))
			{
				methods[i].invoke(keys);
			}
		}
	}

}
