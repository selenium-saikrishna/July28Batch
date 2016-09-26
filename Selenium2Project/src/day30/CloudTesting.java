package day30;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CloudTesting {
	
	@Parameters("browser")
	@Test
	public void dropdownTesttesting(String b) throws MalformedURLException
	{
		DesiredCapabilities caps=null;
		if(b.equals("firefox"))
		{
			caps = DesiredCapabilities.firefox();
			caps.setCapability("platform", "Linux");
			caps.setCapability("version", "45.0");
		}
		else if(b.equals("chrome"))
		{
			caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "53.0");
		}
		else if(b.equals("safari"))
		{
			caps = DesiredCapabilities.safari();
			caps.setCapability("platform", "OS X 10.11");
			caps.setCapability("version", "9.0");
		}
		String USERNAME = "inetsolv";
		 String ACCESS_KEY = "b8fc04a9-78a3-4e5f-837c-4e6f9f41dd3e";
		 String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
		 WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		 driver.get("http://newtours.demoaut.com");
			driver.findElement(By.linkText("REGISTER")).click();
			WebElement drop=driver.findElement(By.name("country"));
			List<WebElement> dropdown=drop.findElements(By.tagName("option"));
			System.out.println(dropdown.size());
			for(int i=0;i<dropdown.size();i++)
			{
				dropdown.get(i).click();
				if(dropdown.get(i).isSelected())
				{
					System.out.println(dropdown.get(i).getText()+" is active");
				}
				else
				{
					System.out.println(dropdown.get(i).getText()+" is inactive");
				}
			}
			driver.quit();
	}

}
