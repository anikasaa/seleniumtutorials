package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12TestCase1ALERT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// TESTCASE #1
		WebElement ele = driver.findElement(By.id("result"));

		// finding element and clicking on it
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();

		// switching to aler and getText
		String alertString = driver.switchTo().alert().getText();
		if (alertString.equals("I am a JS Alert")) {
			System.out.println("Test case pass");
		}

		driver.switchTo().alert().accept();
		if (ele.getText().equals("You successfully clicked an alert")) {
			System.out.println("Testcase");
		}

	}

}
