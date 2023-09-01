package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5findElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));

		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();

		WebElement logo = driver.findElement(By.cssSelector(".app_logo"));
		if (logo.isDisplayed()) {
			System.out.println("test case 3 pass");
		} else {
			System.out.println("test case 3 fail");
		}

	}

}
