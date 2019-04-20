package day7;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngTesting {
	
	@Test(priority=0)
	public void testcase7(){
		System.out.println("Testcase 7");
	}
	
	@Test(priority=1000, groups="Sanity")
	public void testcase1(){
		System.out.println("Testcase 1");
	}
	
	@Test(priority=-1000, groups="Sanity")
	public void testcase8(){
		System.out.println("Testcase 8");
	}
	
	@Test(priority=2000, enabled=false)
	public void testcase3(){
		System.out.println("Testcase 3");
	}
	
	@Test(priority=3000)
	public void testcase4(){
		System.out.println("Testcase 4");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforeAMethod(){
		System.out.println("Before a method");
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterAMethod(){
		System.out.println("After a method");
	}

	@BeforeClass(alwaysRun=true)
	public void beforeAClass(){
		System.out.println("First method to be executed when a class loads");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterAClass(){
		System.out.println("Last method to be executed in a class");
	}
}

