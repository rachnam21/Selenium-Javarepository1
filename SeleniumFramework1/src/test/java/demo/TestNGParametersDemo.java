package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	
	@Test
	@Parameters({"Myname"})
	public void test1(@Optional("Rachna") String name)
	
	{
	System.out.println("Name is:"+name);	
	}

}
