package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver_06042019/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/droppable/");

		WebElement frameElement = driver.findElement(By.className("demo-frame"));

		driver.switchTo().frame(frameElement);

		Actions action = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		String colorBeforeDragNDrop = target.getCssValue("color");
		// action.dragAndDrop(source, target).build().perform();

		action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();

		String colorAfterDragNDrop = target.getCssValue("color");

		System.out.println("Before Drag and Drop : " + colorBeforeDragNDrop);

		System.out.println("After Drag and Drop : " + colorAfterDragNDrop);
	}

}
