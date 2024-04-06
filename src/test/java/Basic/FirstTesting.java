package Basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTesting {
	
	@Test(priority = 3)
	public void tc1()
	{
	Assert.assertEquals(15, 17);
		System.out.println("my first test case will print");
	}
	@Test(priority = 2)
	public void tc2()
	{
		System.out.println("my second test case will print");
	}
	@Test(priority = 1)
	public void tc3()
	{
		System.out.println("my third test case will print");
	}


	

}
