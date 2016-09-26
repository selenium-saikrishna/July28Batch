package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLogin {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://yahoomail.com");
		System.out.println(driver.getWindowHandle());
		driver.manage().window().maximize();
		driver.findElement(By.id("login-username")).sendKeys("saikrishna_rhce");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("asdfg");
		driver.findElement(By.name("signin")).click();
	}

}
