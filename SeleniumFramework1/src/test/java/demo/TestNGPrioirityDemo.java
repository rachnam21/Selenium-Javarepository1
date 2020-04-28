package demo;

import org.testng.annotations.Test;

public class TestNGPrioirityDemo {

	@Test
	public void onetest1(){
		System.out.println("This is Test1");
	}
	
	@Test(priority=1)
	public void twotest2(){
		System.out.println("This is Test2");
	}
	
	@Test(priority=2)
	public void threetest3(){
		System.out.println("This is Test3");
	}
	
}
