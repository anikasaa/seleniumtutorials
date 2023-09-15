package seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10aSelectallDropdownMenus {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

		for (WebElement checkbox : checkboxes) {
			if (!checkbox.isSelected()) {

				checkbox.click();
				System.out.println(checkbox.isSelected());
			}
			else {
				System.out.println(checkbox.isSelected());
			}

		}
		for (WebElement checkbox : checkboxes) {
			checkbox.click();
			boolean isSelected = checkbox.isSelected();
			System.out.println(isSelected);

		}

	}
}
