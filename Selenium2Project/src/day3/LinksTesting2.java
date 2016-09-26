package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksTesting2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://bing.com");
		String expUrl=driver.findElement(By.linkText("Videos")).getAttribute("href");
		driver.findElement(By.linkText("Videos")).click();
		String actUrl=driver.getCurrentUrl();
		if(actUrl.equals(expUrl))
		{
			System.out.println("Videos link is working correctly");
		}
		else
		{
			System.out.println("Videos link is not working correctly");
		}
		driver.close();
	}

}
