package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login  extends BaseClass{
	@Test
	public void logintest()
	{
		
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		
	}

}
