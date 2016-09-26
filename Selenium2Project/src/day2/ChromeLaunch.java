package day2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class ChromeLaunch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://bing.com");
		driver.findElement(By.linkText("Help")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try
			{
				driver.findElement(By.id("privacyLabel")).click();
				break;
			}
			catch(Exception e)
			{
				
			}
		}
		///////////////////////////////////////////////////////
		
		windowids=driver.getWindowHandles();
		 it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try
			{
				driver.findElement(By.xpath("//*[@id='mainhowtoaccesscontrolyourdatamodule_ShortDescription']/label/p[2]/a")).click();
				break;
			}
			catch(Exception e)
			{
				
			}
		}
		
		
		
		
		
		
		

	}

}
