package seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10bSelectRadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		List<WebElement> radioBtns = driver.findElements(By.cssSelector("input[name='color']"));

		for (WebElement radioBtn : radioBtns) {
			radioBtn.click();

			boolean isSelected = radioBtn.isSelected();
			System.out.println(isSelected);

		}

	}

}
