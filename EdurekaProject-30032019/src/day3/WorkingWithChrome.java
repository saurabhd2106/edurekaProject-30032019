package day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver_06042019/chromedriver.exe");

		driver = new ChromeDriver();
		
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
