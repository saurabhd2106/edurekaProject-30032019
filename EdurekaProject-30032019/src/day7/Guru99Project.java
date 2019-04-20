package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99Project {

	WebDriver driver;

	@Parameters("browserType")
	@BeforeClass
	public void invokeBrowser(String browserType) {
		if (browserType.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver_06042019/chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserType.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");

			driver = new EdgeDriver();

		} else if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/v4");
	}

	@Test(priority = 0)
	public void verifyTitleOfthePage() {

		String titleOfThePage = driver.getTitle();
		
		Assert.assertEquals(titleOfThePage, "Guru99 Bank Home Page 1");
	}

	@Parameters({ "userid", "userPass" })
	@Test(priority = 1000)
	public void verifyLoginToGuru99(String userId, String userPassword) {

		WebElement userIdElement;

		userIdElement = driver.findElement(By.name("uid"));

		userIdElement.sendKeys(userId);

		driver.findElement(By.name("password")).sendKeys(userPassword);

		driver.findElement(By.name("btnLogin")).click();
		
		String managerIdText = driver.findElement(By.xpath("//td[contains(text(),'Manger Id :')]")).getText();

		String actualManagerId = managerIdText.split(":")[1].trim();
		
		Assert.assertEquals(actualManagerId, userId);
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
