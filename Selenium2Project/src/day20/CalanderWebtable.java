package day20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalanderWebtable {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void clanaderTest()
	{
		driver.findElement(By.id("OneWay")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		driver.findElement(By.id("ToTag")).sendKeys("Los Angeles, US - Los Angeles (LAX)");
		driver.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		
		String doj="20/01/2018";
		String[] a=doj.split("/");
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		int x=Integer.parseInt(a[1]);
		String month=months[x-1];
		String day=a[0];
		String year=a[2];
		
		String calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calYear.equals(year))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calMonth.equals(month))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		
		WebElement calander=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table"));
		List<WebElement> rows=calander.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(day))
				{
					cols.get(j).click();
					break;
				}
			}
		}
		Sleeper.sleepTightInSeconds(8);
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
