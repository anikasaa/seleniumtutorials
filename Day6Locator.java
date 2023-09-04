package seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
//		WebElement ele = driver.findElement(By.id("user-name"));
//		ele.sendKeys("standard_user");

		// Name Locator
		// Name Locator of html element to select the element
//		WebElement ele = driver.findElement(By.name("user-name"));
//		ele.sendKeys("standard_user");

		// Class Name locator
		// class locator of html element to select the element
//		WebElement ele = driver.findElement(By.className("input_error"));
//		ele.sendKeys("standard_user");

//		List<WebElement> eleList = driver.findElements(By.className("input_error"));
//		eleList.get(1).sendKeys("secret_sauce");

//		TagName Locator

		driver.findElements(By.tagName("input")).get(1).sendKeys("secret_sauce");

//		CssSelector Locator

		// .className
		// #idValue
		// tagName
		// tagName[attribute = 'value']
		// <input class="input_error form_input" placeholder="Username" type="text"
		// data-test="username" id="user-name" name="user-name" autocorrect="off"
		// autocapitalize="none" value="">

		driver.findElement(By.cssSelector(".login_logo"));
		driver.findElement(By.cssSelector("user-name"));
		driver.findElement(By.cssSelector("form"));
		driver.findElement(By.cssSelector("input[placeholder='Username']"));

		// Xpath
		// ----//tagName[@attribute = 'value']

		// LinkText

		// PartialLinkText

	}

}
