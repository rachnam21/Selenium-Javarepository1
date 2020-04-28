package Listeners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import junit.framework.*;



public class TestListenerDEMO {
	
	@Test
	public void test1()
	{
		System.out.println("I m inside TEST1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("I m inside TEST2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3()
	{
		System.out.println("I m inside TEST3");
		throw new SkipException("Skip Test");
	}
}
