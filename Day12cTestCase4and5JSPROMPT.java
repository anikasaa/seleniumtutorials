package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12cTestCase4and5JSPROMPT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement ele = driver.findElement(By.id("result"));

		// TEST CASE 4(OK BUTTON)

		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String text = driver.switchTo().alert().getText();
		if (text.equals("I am a JS prompt")) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}

		driver.switchTo().alert().sendKeys("Anisha");
		driver.switchTo().alert().accept();
		if (ele.getText().equals("You entered: Anisha")) {
			System.out.println("Test case Pass");
		} else {
			System.out.println("Test Case Fail");
		}

		// TEST CASE 5(CANCLE BUTTON)
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String text2 = driver.switchTo().alert().getText();
		if (text.equals("I am a JS prompt")) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}
		driver.switchTo().alert().sendKeys("Anisha");
		driver.switchTo().alert().dismiss();
		if (ele.getText().equals("You entered: null")) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}

	}

}
