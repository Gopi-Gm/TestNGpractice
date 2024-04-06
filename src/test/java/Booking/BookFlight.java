package Booking;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookFlight {
	
	private static final String BookFlight_ForRoundTrip_TestCase2 = null;
	@BeforeMethod
	public void BeforeMethod_TestCase1()
	{
		System.out.println("it will run before every test case");
	}
	@AfterMethod
	public void AfterMethod_TestCase1()
	{
		System.out.println("it will run after every test case");
	}
	@Test
	public void BookFlight_ForRoundTrip_TestCase1()
	{
		System.out.println("TestCase1");
	}
	@Test
	public void BookFlight_ForRoundTrip_TestCase2()
	{
		System.out.println("TestCase2");

	}
	
	@BeforeTest
	public void BeforeTest_TestCase()
	{
		System.out.println("it should run first");
	}
	@Test(dependsOnMethods = {"BookFlight_ForRoundTrip_TestCase2"})
	public void BookFlight_OneWay_TestCase3()
	{
		System.out.println("TestCase3");

	}
	@AfterTest
	public void AfterTest_TestCase()
	{
		System.out.println("it should run last");
	}
	@Test(enabled = false)
	public void BookFlight_OneWay_TestCase4()
	{
		System.out.println("TestCase4");

	}
	
	

}
