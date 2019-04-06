package day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithFirefox {

	FirefoxDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

		driver = new FirefoxDriver();
		
		Dimension dim = new Dimension(500, 500);
		
		driver.manage().window().setSize(dim);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://qatechhub.com");

	}

	public void printTitleOfThePage() {
		String titleOfThePage = driver.getTitle();

		System.out.println("Title of the page : " + titleOfThePage);
	}

	public void navigateCommands() {
		driver.navigate().to("http://facebook.com");

		driver.navigate().back();
		driver.navigate().forward();

		driver.navigate().refresh();
	}
	
	public void closeBrowser(){
	
		//It closes only the current active window
		//driver.close();
		
		//It closes all the windows open by selenium
		driver.quit();
	}

}
