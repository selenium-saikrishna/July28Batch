package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class VideoRecording {
	ATUTestRecorder recorder;
	FirefoxDriver driver;
	@BeforeTest
	public void setUp() throws ATUTestRecorderException
	{
		recorder=new ATUTestRecorder("c:\\users\\sai\\desktop\\Recording","OrangeHRM",false);
		recorder.start();
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	public void  recordTest()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("Welcome Admin")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterTest
	public void tearDown() throws ATUTestRecorderException
	{
		driver.close();
		recorder.stop();
	}

}
