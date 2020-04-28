package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TESTNGIgnoreDemo {

	@Ignore
	@Test
	public void test1(){
		System.out.println("I m in TEST1");
	}
	
	@Test
	public void test2(){
		System.out.println("I m in TEST2");
}
