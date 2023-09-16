package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12bTestCase2and3CONFIRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// TEST CASE 2
		WebElement ele = driver.findElement(By.id("result"));

		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		String text = driver.switchTo().alert().getText();
		if (text.equals("I am a JS Confirm")) {
			System.out.println("test case for element text passed");
		}
		driver.switchTo().alert().accept();
		System.out.println(ele.getText());
		if (ele.getText().equals("You clicked: Ok")) {
			System.out.println("Test Case Element pass");
		}

		// TEST CASE 3

		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		String text2 = driver.switchTo().alert().getText();
		if (text.equals("I am a JS Confirm")) {
			System.out.println("test case for element text passed");
		}
		driver.switchTo().alert().dismiss();
		System.out.println(ele.getText());
		if (ele.getText().equals("You clicked: Cancel")) {
			System.out.println("test case for element text pass");
		}
	}

}
