package demo;

import org.testng.annotations.Test;
@Test(groups={"AllClasstests"})
public class TestNGGroupsDemo {
	
	@Test(groups={"sanity"})
	public void test1(){
		System.out.println("This is test1");
	}
	
	@Test(groups={"Windows.regression"})
	public void test2(){
		System.out.println("This is test2");
	}
	
	@Test(groups={"sanity","regression"})
	public void test3(){
		System.out.println("This is test3");
	}
	
	@Test
	public void test4(){
		System.out.println("This is test4");
	}
}
