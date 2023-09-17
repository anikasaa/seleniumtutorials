package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkModalpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		//driver.findElement(By.cssSelector("#button2")).click();
		
		driver.findElement(By.cssSelector("#button2")).click();
		try {
            Thread.sleep(2000); 						
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		boolean A1=driver.findElement(By.cssSelector("#myModal > div > div > div.modal-header > h4")).isDisplayed();
		if(A1) {
			System.out.println("Test case passed.");
		}
		else {
			System.out.println("Test case failed.");
		}
		
		
		
		
		
		
	}

}
