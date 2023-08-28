package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Program2 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// is displayed method

		WebElement heading = driver.findElement(By.cssSelector("#main-header > h1"));
		boolean H1 = heading.isDisplayed();
		System.out.println(H1);

		// is enabled method for radio button
		WebElement radio_one = driver
				.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(1)"));
		boolean H2 = radio_one.isEnabled();
		System.out.println(H2);

		WebElement radio_two = driver
				.findElement(By.cssSelector("#radio-buttons-selected-disabled  > input[type=radio]:nth-child(3)"));
		boolean H3 = radio_two.isEnabled();
		System.out.println(H3);

		// is selected method

		WebElement selectedButton = driver
				.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)"));
		boolean H4 = selectedButton.isSelected();
		System.out.println(H4);

	}

}
