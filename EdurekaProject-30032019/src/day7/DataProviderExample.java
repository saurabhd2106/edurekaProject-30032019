package day7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@Test(dataProvider = "getData")
	public void printTestData(String username, String password, int employeeId) {
		System.out.println("Username : " + username + " Password : " + password);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[4][3];

		data[0][0] = "Saurabh";
		data[0][1] = "abc@123";
		data[0][2] = 4238495;

		data[1][0] = "Gaurav";
		data[1][1] = "abc@123";
		data[1][2] = 43242;

		data[2][0] = "Amit";
		data[2][1] = "abc@123";
		data[2][2] = 123434;

		data[3][0] = "Kapil";
		data[3][1] = "abc@123";
		data[3][2] = 876876;

		return data;
	}

}
