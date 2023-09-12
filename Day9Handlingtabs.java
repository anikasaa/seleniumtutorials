package seleniumtutorials;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9Handlingtabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/index.html");
		driver.findElement(By.cssSelector("#contact-us > div > div.section-title > h1")).click();

		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow = iterator.next();
		System.out.println(childwindow);

		driver.switchTo().window(childwindow);

		driver.findElement(By.name("first_name")).sendKeys("Anisha");
		driver.findElement(By.name("last_name")).sendKeys("Tuladhar");

		driver.switchTo().window(parentwindow);

	}

}
