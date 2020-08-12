package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	/**Developed by Rajesh Modi - Aug 12 2020**/
	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
}
