package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting1 {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		String expTitle="Gmail";
		driver.findElement(By.linkText("Gmail")).click();
		String actTitle=driver.getTitle();
		if(expTitle.equals(actTitle))
		{
			System.out.println("Gmail link is working correctly");
		}
		else
		{
			System.out.println("Gmail link is not working correctly");
		}
		driver.close();
		
		

	}

}
