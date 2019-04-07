package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Project {

	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver_06042019/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/v4");
	}

	public void login(String userId, String userPassword) {

		WebElement userIdElement;

		userIdElement = driver.findElement(By.name("uid"));

		userIdElement.sendKeys(userId);

		driver.findElement(By.name("password")).sendKeys(userPassword);

		driver.findElement(By.name("btnLogin")).click();

	}

	public void addCustomer() {
		driver.findElement(By.linkText("New Customer")).click();

		driver.findElement(By.name("name")).sendKeys("Kanika");

		driver.findElement(By.xpath("//input[@value='f']")).click();

		driver.findElement(By.name("dob")).sendKeys("11/11/2000");

		driver.findElement(By.name("addr")).sendKeys("Gurgaon Hr India");

		driver.findElement(By.name("city")).sendKeys("Gurgaon");
		driver.findElement(By.name("state")).sendKeys("Haryana");

		driver.findElement(By.name("pinno")).sendKeys("123211");

		driver.findElement(By.name("telephoneno")).sendKeys("453425345");

		String emailId = "fdsfg" + System.currentTimeMillis() + "@gmail.com";

		driver.findElement(By.name("emailid")).sendKeys(emailId);

		driver.findElement(By.name("password")).sendKeys("Gurgaon");

		driver.findElement(By.name("sub")).click();
	}

	public String getCustomerId() {
		return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
	}

	public void addAccount(String customerId){
		
		driver.findElement(By.linkText("New Account")).click();
		
		driver.findElement(By.name("cusid")).sendKeys(customerId);
		
		WebElement dropdown = driver.findElement(By.name("selaccount"));
		
		Select selAccount = new Select(dropdown);
		
		selAccount.selectByVisibleText("Current");
		
		boolean isMultipleFlag = selAccount.isMultiple();
		
		System.out.println(isMultipleFlag);
		
		driver.findElement(By.name("inideposit")).sendKeys("3733405");
		
		driver.findElement(By.name("button2")).click();
	}
}
