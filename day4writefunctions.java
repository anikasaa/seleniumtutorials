package seleniumtutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4writefunctions {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		// test Case 1

		performLogin(driver, "standard_user", "secret_sauce");
		boolean TC1 = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"))
				.isDisplayed();
		if (TC1) {
			System.out.println("Test case 1 passes");
		} else {
			System.out.println("Test case 1 failed");
		}

		// Test Case 2
		driver.get("https://www.saucedemo.com/");
		performLogin(driver, "locked_out_user", "secret_sauce");
		boolean TC2 = driver
				.findElement(
						By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"))
				.isDisplayed();
		if (TC2) {
			System.out.println("Test Case 2 pass");
		} else {
			System.out.println("Test Case 2 failed");
		}

		// Test Case 3
		driver.get("https://www.saucedemo.com/");
		performLogin(driver, "problem_user", "secret_sauce");
		boolean TC3 = driver.findElement(By.cssSelector("#item_0_img_link > img")).isDisplayed();
		if (TC3) {
			System.out.println("Test Case 3 pass");
		} else {
			System.out.println("Test Case 3 failed");
		}

		// Test Case 4
		driver.get("https://www.saucedemo.com/");
		performLogin(driver, "performance_glitch_user", "secret_sauce");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		int displayedImageCount = numOfImg(driver);

		if (displayedImageCount > 0) {
			System.out.println("Number of displayed images:" + displayedImageCount);
			System.out.println("Test Case 4 passed");
		} else {
			System.out.println("Test Case 4 failed");
		}

	}

	private static int numOfImg(ChromeDriver driver) {
		int i = 0;
		// counting images
		// list and size

		List<WebElement> abc = driver.findElements(By.cssSelector(".inventory_item_price"));
		System.out.println(abc.size());
		return i;
	}

	private static void performLogin(ChromeDriver driver, String username, String password) {
		WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
		WebElement passwordField = driver.findElement(By.cssSelector("#password"));
		WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));

		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();

	}

}
