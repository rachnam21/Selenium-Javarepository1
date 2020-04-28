package demo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGRetryFailedDemo {
	
	@Test
	public void test1(){
		System.out.println("I m inside TEST1");
	}
	@Test
	public void test2(){
		System.out.println("I m inside TEST2");
		int i=1/0;
	}
	@Test
	public void test3(){
		System.out.println("I m inside TEST3");
		Assert.assertTrue(false);
	}
}
