package seleniumtutorials;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11b {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/");

		driver.findElement(By.id("contact-us")).click();
		driver.findElement(By.id("login-portal")).click();
		driver.findElement(By.id("button-clicks")).click();
		driver.findElement(By.id("to-do-list")).click();
		driver.findElement(By.id("page-object-model")).click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		Iterator<String> s = windows.iterator();
		while (s.hasNext()) {
			String windowID = s.next();
			driver.switchTo().window(windowID);

			if (driver.getTitle().equals("WebDriver | Page Object Model")) {
				System.out.println(driver.getTitle());
				System.out.println("test case pass");
				break;
			}
		}
		driver.quit();

	}

}
