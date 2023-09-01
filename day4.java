package seleniumtutorials;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		login(driver, "standard_user", "secret_sauce");
		login(driver, "locked_out_user", "secret_sauce");
		login(driver, "problem_user", "secret_sauce");
		login(driver, "performance_glitch_user", "secret_sauce");
	}

	public static void login(ChromeDriver driver, String username, String password) {
		WebElement username1 = driver.findElement(By.cssSelector("#user-name"));
		WebElement password1 = driver.findElement(By.cssSelector("#password"));

		username1.sendKeys("standard_user");
		password1.sendKeys("secret_sauce");
		

		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		login.click();
		
		WebElement heading = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
		if(heading.isDisplayed()) {
			System.out.println("test case1 passed");
		}
		else {
			System.out.println("test case 1 fail");
		}
		WebElement username2 = driver.findElement(By.cssSelector("#user-name"));
		WebElement password2 = driver.findElement(By.cssSelector("#password"));
		
		username2.sendKeys("locked_out_user");
		password2.sendKeys("secret_sauce");
		WebElement login2 = driver.findElement(By.cssSelector("#login-button"));
		login.click();
		
		WebElement heading2 = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
		if(heading2.isDisplayed()) {
			System.out.println("test case 2 passed");
		}
		else {
			System.out.println("test case 2 fail");
		}
		
		
		
		

	}
	

	
	

}
