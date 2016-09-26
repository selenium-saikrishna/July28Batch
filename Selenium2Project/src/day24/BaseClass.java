package day24;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	static FirefoxDriver driver;
	@BeforeSuite
	public void launchApp()
	{
		driver=new FirefoxDriver();
	}
	@AfterSuite
	public void closeApp()
	{
		driver.quit();
	}

}
