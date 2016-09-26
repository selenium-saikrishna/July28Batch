package day9;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	@Test(enabled=false)
	public void regTest()
	{
		System.out.println("This is for registration");
	}
	@Test(priority=3)
	public void logoutTest()
	{
		System.out.println("This is for logout");
	}
	@BeforeMethod
	public void function1()
	{
		System.out.println("ABCDEF");
	}

}
