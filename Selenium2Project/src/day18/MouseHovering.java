package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHovering {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://yssofindia.org");
		driver.manage().window().maximize();
		
	}
	@Test
	public void mouseHoverTest()
	{
		Actions action=new Actions(driver);
		WebElement aboutYss=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/a/img"));
		WebElement contactUs=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/a"));
		action.moveToElement(aboutYss).moveToElement(contactUs).build().perform();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a")).click();
	}

}
