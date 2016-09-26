package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaptchaAutomation {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.harvard.edu/feedback");
		driver.manage().window().maximize();
	}
	@Test
	public void capthcaTest()
	{
		int z=1;
		while(z<=10)
		{
			driver.findElement(By.id("edit-submitted-name")).sendKeys("Tester1");
			driver.findElement(By.id("edit-submitted-email")).sendKeys("Tester@gmail.com");
			driver.findElement(By.id("edit-submitted-comment")).sendKeys("Stupid change the capthca");
			String x=driver.findElement(By.className("field-prefix")).getText();
			String[] a=x.split(" ");
			int i=Integer.parseInt(a[0]);
			int j=Integer.parseInt(a[2]);
			int k=i+j;
			String str=Integer.toString(k);
			driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
			Sleeper.sleepTightInSeconds(5);
			//driver.findElement(By.name("op")).click();
			driver.get("http://www.harvard.edu/feedback");
		}
	}

}
