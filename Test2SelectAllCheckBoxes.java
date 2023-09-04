package seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class Test2SelectAllCheckBoxes {

	private static final String driver = null;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement option1 = driver
				.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]"));
		WebElement option2 = driver
				.findElement(By.cssSelector("#checkboxes > label:nth-child(3) > input[type=checkbox]"));
		WebElement option4 = driver
				.findElement(By.cssSelector("#checkboxes > label:nth-child(7) > input[type=checkbox]"));
		WebElement option3 = driver
				.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));
		option1.click();
		option2.click();
		option4.click();

		// Assertion
		boolean B1 = option1.isSelected();
		boolean B2 = option2.isSelected();
		boolean B3 = option3.isSelected();
		boolean B4 = option4.isSelected();

		System.out.println(B1);
		System.out.println(B2);
		System.out.println(B3);
		System.out.println(B4);
	}

}
