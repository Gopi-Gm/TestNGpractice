package Booking;

import org.testng.annotations.Test;

public class BookHoliday {
	
	@Test
	public void BookHolidayPackage_destination()
	{
		System.out.println("BookHolidayPackage testcase1");
	}
	@Test(groups = {"Regression"})
	public void BookHolidayPackage_depature()
	{
		System.out.println("BookHolidayPackage testcase2");
	}
	@Test
	public void BookHolidayPackage_return()
	{
		System.out.println("BookHolidayPackage testcase3");
	}
	
	

}
