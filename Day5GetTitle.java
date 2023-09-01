package seleniumtutorials;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day5GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test case 1 pass");
		} else {
			System.out.println("Test case 2 fail");
		}

	}

}
