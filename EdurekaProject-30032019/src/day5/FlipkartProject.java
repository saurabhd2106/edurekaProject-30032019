package day5;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartProject {

	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver_06042019/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
	}

	public void mouseHover() {

		WebElement electronicsLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions action = new Actions(driver);

		action.moveToElement(electronicsLink).build().perform();

		WebElement samsungLink = driver.findElement(By.xpath("(//a[text()='Samsung'])[1]"));

	//	waitTillElementVisble(10, By.xpath("(//a[text()='Samsung'])[1]"));
		
		waitTillElementVisibleWithFluentWait(10, By.xpath("(//a[text()='Samsung'])[1]"), 1);
		action.moveToElement(samsungLink).click().build().perform();

	}

	private void waitTillElementVisble(int timeOutInSeconds, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	private void waitTillElementVisibleWithFluentWait(int timeOutInSeconds, By locator, int pollingTime) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOutInSeconds))
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
