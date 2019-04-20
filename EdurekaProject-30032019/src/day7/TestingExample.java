package day7;

import org.testng.annotations.Test;

public class TestingExample {

	@Test
	public void testcase9() {
		System.out.println("Testcase 3 from class 2");
	}

	@Test(groups = "Sanity")
	public void testcase10() {
		System.out.println("Testcase 10 from class 2");
	}

	@Test(groups = "Sanity")
	public void testcase11() {
		System.out.println("Testcase 11 from class 2");
	}

	@Test
	public void testcase19() {
		System.out.println("Testcase 19 from class 2");
	}
}
