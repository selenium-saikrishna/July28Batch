package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XpathCreation2 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://news.google.co.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void xpathTest()
	{
		List<WebElement> headlines=driver.findElements(By.xpath("//h2/a/span[@class='titletext']"));
		for(int i=0;i<headlines.size();i++)
		{
			System.out.println(headlines.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
