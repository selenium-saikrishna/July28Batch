package day10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotOnError1 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void elementPresenceTest() throws IOException
	{
		if(driver.findElements(By.linkText("Selenium")).size()==0)
		{
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile,new File("c:\\users\\sai\\desktop\\Google.png"));
		}
		else
		{
			driver.findElement(By.linkText("Selenium")).click();
		}
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
