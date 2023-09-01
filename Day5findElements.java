package seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5findElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// findElements....check whether particular product is available or not

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		String expectedProduct = "Sauce Labs Bolt T-Shirt";
		driver.get("https://www.saucedemo.com/");

		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));

		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();

		List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item_name"));
		boolean productfound = false;

		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getText().equals(expectedProduct)) {
				productfound = true;
				break;

			}
		}

		if (productfound) {
			System.out.println("product available");
			System.out.println("test case 4 pass");
		} else {
			System.out.println("product not available");
			System.out.println("test case 4 fail");
		}

	}

}
