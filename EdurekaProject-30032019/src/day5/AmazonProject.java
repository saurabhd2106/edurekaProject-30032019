package day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonProject {

	WebDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver_06042019/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

	}

	public void searchProduct(String product, String category) {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select selectDropdown = new Select(dropdown);

		selectDropdown.selectByVisibleText(category);

		driver.findElement(By.xpath("//input[@value='Go']")).click();

		String result = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();

		System.out.println(result);

	}

	public String getNthProduct(int productNumber) {
		String productXpath = String.format("//div[@class='s-result-list sg-row']/div[@data-index='%d']",
				productNumber);

		System.out.println(productXpath);
		return driver.findElement(By.xpath(productXpath)).getText();
	}

	public void getAllProducts() {

		List<WebElement> allProduct = driver.findElements(By.xpath("//div[@class='s-result-list sg-row']/div"));

		for (WebElement product : allProduct) {
			System.out.println(product.getText());

			System.out.println("-------------------------------------------------");
		}
	}

	public void getAllProductsViaScrollDown() {

		List<WebElement> allProduct = driver.findElements(By.xpath("//div[@class='s-result-list sg-row']/div"));

		Actions action = new Actions(driver);

		for (WebElement product : allProduct) {

			action.moveToElement(product).build().perform();

			System.out.println(product.getText());

			System.out.println("-------------------------------------------------");
		}
	}
	
	public void getAllProductsViaScrollDownUsingJS() {

		List<WebElement> allProduct = driver.findElements(By.xpath("//div[@class='s-result-list sg-row']/div"));

		int X; int Y;

		for (WebElement product : allProduct) {

			X = product.getLocation().x;
			
			Y = product.getLocation().y;
			
			scrollBy(X, Y);

			System.out.println(product.getText());

			System.out.println("-------------------------------------------------");
		}
	}
	
	private void scrollBy(int x, int y){
		
		JavascriptExecutor jsEngine;
		
		String jsCommand = String.format("window.scrollBy(%d,%d);", x, y);
	
		jsEngine = (JavascriptExecutor) driver;
		
		jsEngine.executeScript(jsCommand);
		
	}

}
