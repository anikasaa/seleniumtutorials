package seleniumtutorials;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test1ValidatetheTitle {

	public static void main(String[] args) {
		  
		String expectedTitle="WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)";
		
		String titleOfPage = driver.getTitle();
		
		if(expectedTitle.equals(titleOfPage)) {
		System.out.println("Test case passed.");
		}
		

	}

}
