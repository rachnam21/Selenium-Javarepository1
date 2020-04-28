package Listeners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import junit.framework.*;



public class TestListenerDEMO2 {
	
	@Test
	public void test4()
	{
		System.out.println("I m inside TEST4");
	}
	
	@Test
	public void test5()
	{
		System.out.println("I m inside TEST5");
		
	}
	
	@Test
	public void test6()
	{
		System.out.println("I m inside TEST6");
		throw new SkipException("Skip Test");
	}
}
