package seleniumtutorials;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10HandlingTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		driver.findElement(By.cssSelector("#contact-us")).click();

		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}

		System.out.println(driver.getCurrentUrl());
		WebElement firstName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement comment = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submitbtn = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));

		firstName.sendKeys("Anisha");
		lastName.sendKeys("Tuladhar");
		email.sendKeys("anisha.kansakar@gmail.com");
		comment.sendKeys("i am learning selenium");
		submitbtn.click();

		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());

	}

}
