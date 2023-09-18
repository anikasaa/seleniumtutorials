package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14IFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		
		//Iframe
//		WebElement ele = driver.findElement(By.cssSelector("frame"));
//		driver.switchTo().frame(ele);
		
		//Switch to iFrame by index
		driver.switchTo().frame(0);
		WebElement ele2 = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a"));
		System.out.println(ele2.isDisplayed());
		
		//switching back to main content
		driver.switchTo().defaultContent();
		
		//finding element in the main content
		driver.findElement(By.cssSelector("#nav-title")).isDisplayed();
		
		//validating the title of the main content
		if(driver.getTitle().equals("WebDriver | IFrame")) {
			System.out.println("Test Case pass");
		}
		else {
			System.out.println("Test Case Fail");
		}
		
		//closing the browser
		driver.close();
		
	

	}

}
