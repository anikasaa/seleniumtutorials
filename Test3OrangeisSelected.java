package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class Test3OrangeisSelected {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// select orange and assert if it is checked

		WebElement orangebutton = driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(7)"));

		orangebutton.click();
		boolean B1 = orangebutton.isSelected();
		if (B1 == true) {
			System.out.println("it is all selected");
		}

	}

}
