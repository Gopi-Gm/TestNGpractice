package Booking;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookFlight2 {
	
	@Test(groups = {"Regression"})
	public void BookFlight_ForRoundTrip_TestCase1()
	{
		System.out.println("BookFlight RoundTrip TestCase1");
	}
	@Test
	public void BookFlight_ForRoundTrip_TestCase2()
	{
		System.out.println("BookFlight RoundTrip TestCase2");

	}

	@Test
	public void BookFlight_OneWay_TestCase1()
	{
		System.out.println("BookFlight one way TestCase1");
	}
	@Test
	public void BookFlight_OneWay_TestCase2()
	{
		System.out.println("BookFlight one way TestCase2");

	}
	
	

}
