package seleniumtutorials;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15WritingInFileonfigProperties {

	public static void main(String[] args) {

		Properties prop = new Properties();

		String path = "C:\\Users\\anish\\eclipse-workspace\\seleniumtutorials\\src\\seleniumtutorials\\config.properties";

		try {

			FileInputStream fileinput = new FileInputStream(path);
			prop.load(fileinput);
			String url = prop.getProperty("baseUrl");
			String browser = prop.getProperty("browser");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");

			// writing into the file

			prop.put("city", "pune");
			FileOutputStream outputStrem = new FileOutputStream(path);

			// storing the properties file
			prop.store(outputStrem, "this is the sample properties file");

			if (browser.equals("chrome")) {

				// code to setup browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();

				driver.get(url);
				driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
				driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
				driver.findElement(By.cssSelector("#login-button")).click();

				if (driver.getCurrentUrl().contains("inventory")) {
					System.out.println("test case pass");
				} else {
					System.out.println("test case fail");
				}

				// code to set up firefox
			} else if (browser.equals("firefox")) {

				// code to set up edge
			} else if (browser.equals("edge")) {

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
